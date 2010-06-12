
-- use databe librarymanagement

use librarymanagement

go

if exists (select * from dbo.sysobjects where name = 'searchEmployeeByID')
begin
drop proc searchEmployeeByID
end
go
create proc searchEmployeeByID
@UserName nvarchar(40),
@FullName nvarchar(40)
as
begin
	if (@UserName = '' and @FullName = '')
	begin
		SELECT ISNULL(UserName,'') AS UserName,
			ISNULL(FullName,'') AS FullName,
			ISNULL(Address,'') AS Address, 
			ISNULL(PhoneNumber,'') AS PhoneNumber,
			ISNULL(Department,'') AS Department,
			ISNULL(Statuts,'') AS Statuts
		FROM Employee
	end
	else if (@UserName = '' and @FullName != '')
	begin
		SELECT ISNULL(UserName,'') AS UserName,
			ISNULL(FullName,'') AS FullName,
			ISNULL(Address,'') AS Address, 
			ISNULL(PhoneNumber,'') AS PhoneNumber,
			ISNULL(Department,'') AS Department,
			ISNULL(Statuts,'') AS Statuts
		FROM Employee 
		where FullName LIKE '%' + @FullName + '%'		
	end
end

exec searchEmployeeByID '','a'