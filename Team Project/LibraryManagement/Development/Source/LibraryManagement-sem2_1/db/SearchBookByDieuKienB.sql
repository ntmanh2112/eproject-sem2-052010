if exists (select * from dbo.sysobjects where name = 'searchBookByDieuKien')
begin
drop proc searchBookByDieuKien
end
go
create proc searchBookByDieuKien
@TypeID int,
@Title nvarchar(40)
as
begin
	if (@TypeID < 0 AND @Title = '')
	begin
		SELECT ISNULL(A.ID,'') AS ID, 
			ISNULL(CallNumber,'') AS CallNumber,
			ISNULL(ISBN,'') AS ISBN,
			ISNULL(Title,'') AS Title, 
			ISNULL(D.FullName,'') AS Author, 
			ISNULL(Statuts,'') AS Statuts, 
			ISNULL(Last_updated_date,'') AS Last_updated_date,
			ISNULL(B.Name,'') AS Type, 
			ISNULL(C.Name,'') AS Producers,
			ISNULL(A.Address,'') AS Address 
		FROM Book A 
			left join Type B on A.TypeID = B.ID 
			left join Producers C on A.ProducersID = C.ID 
			left join Author D on A.AuthorID = D.ID
	end
	else if (@TypeID < 0 AND @Title != '')
	begin
		SELECT ISNULL(A.ID,'') AS ID, 
			ISNULL(CallNumber,'') AS CallNumber,
			ISNULL(ISBN,'') AS ISBN,
			ISNULL(Title,'') AS Title, 
			ISNULL(D.FullName,'') AS Author, 
			ISNULL(Statuts,'') AS Statuts, 
			ISNULL(Last_updated_date,'') AS Last_updated_date,
			ISNULL(B.Name,'') AS Type, 
			ISNULL(C.Name,'') AS Producers,
			ISNULL(A.Address,'') AS Address 
		FROM Book A 
			left join Type B on A.TypeID = B.ID 
			left join Producers C on A.ProducersID = C.ID 
			left join Author D on A.AuthorID = D.ID
		where A.Title LIKE '%' + @Title + '%'		
	end
	else if (@TypeID > 0 AND @Title = '')
	begin
		SELECT ISNULL(A.ID,'') AS ID, 
			ISNULL(CallNumber,'') AS CallNumber,
			ISNULL(ISBN,'') AS ISBN,
			ISNULL(Title,'') AS Title, 
			ISNULL(D.FullName,'') AS Author, 
			ISNULL(Statuts,'') AS Statuts, 
			ISNULL(Last_updated_date,'') AS Last_updated_date,
			ISNULL(B.Name,'') AS Type, 
			ISNULL(C.Name,'') AS Producers,
			ISNULL(A.Address,'') AS Address 
		FROM Book A 
			left join Type B on A.TypeID = B.ID 
			left join Producers C on A.ProducersID = C.ID 
			left join Author D on A.AuthorID = D.ID
		where B.ID=@TypeID 
	end
	else if (@TypeID > 0 AND @Title != '')
	begin 
	SELECT ISNULL(A.ID,'') AS ID, 
		ISNULL(CallNumber,'') AS CallNumber,
		ISNULL(ISBN,'') AS ISBN,
		ISNULL(Title,'') AS Title, 
		ISNULL(D.FullName,'') AS Author, 
		ISNULL(Statuts,'') AS Statuts, 
		ISNULL(Last_updated_date,'') AS Last_updated_date,
		ISNULL(B.Name,'') AS Type, 
		ISNULL(C.Name,'') AS Producers,
		ISNULL(A.Address,'') AS Address 
	FROM Book A 
		left join Type B on A.TypeID = B.ID 
		left join Producers C on A.ProducersID = C.ID 
		left join Author D on A.AuthorID = D.ID 
	WHERE B.ID = @TypeID and A.Title = like '%' + @Title + '%'
	end
end

exec searchBookByDieuKien 1,'abc'