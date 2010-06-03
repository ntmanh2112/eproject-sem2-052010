-- use databe librarymanagement

use librarymanagement

go

-- insert table Employee

	Insert into Employee values ('TuanHQ',N'Huỳnh Quốc Tuấn',N'44 Nguyễn Biểu P1, Q5','0905459573','',1)
	Insert into Employee values ('HungT',N'Từ Hùng',N'44 Nguyễn Biểu P1, Q5','0905459573','',1)
	Insert into Employee values ('PhuongTQ',N'Từ Quý Phượng',N'44 Nguyễn Biểu P1, Q5','0905459573','',1)

--insert table users
	
	Insert into Users values ('TuanHQ','TuanHQ',getdate())
	Insert into Users values ('HungT','HungT',getdate())
	Insert into Users values ('PhuongTQ','PhuongTQ',getdate())

--insert table sys_Function

	Insert into sys_Function values ('Admin')
	Insert into sys_Function values ('Libarian')
	Insert into sys_Function values ('Employee')

--insert tabele sys_User_Function

	Insert into sys_User_Function values ('TuanHQ',0)
	Insert into sys_User_Function values ('HungT',1)
	Insert into sys_User_Function values ('PhuongTQ',2)

--insert table Author
	
	Insert into Author values (N'Võ Đức Thiện','abc',getdate())
	Insert into Author values (N'Võ Trung Hiếu','edf',getdate())
	Insert into Author values (N'Lieou Y Huyền','ght',getdate())

--insert into Type
	
	Insert into Type Values ('Kinh Dị')
	Insert into Type Values ('Tình Cảm')
	Insert into Type Values ('Truyện Cười')
	Insert into Type Values ('Khoa Học')
	Insert into Type Values ('Văn Học')
	Insert into Type Values ('Thể Thao')
	Insert into Type Values ('Nấu Ăn')

--insert into Producers

	Insert into Producers Values ('Kim Đồng','')
	Insert into Producers Values ('Tuổi Trẻ','')
	Insert into Producers Values ('Thành Phố','')
	Insert into Producers Values ('Phụ nữ','')

--insert into Book
	
	Insert into Book values ('ab-vo-001','','abc',0,0,getdate(),1,1,'dãy A hàng 2 dòng 1 thứ 1')
	Insert into Book values ('ba-vo-001','','bac',1,0,getdate(),1,1,'dãy A hàng 3 dòng 1 thứ 1')
	Insert into Book values ('ca-li-001','','cab',2,0,getdate(),1,1,'dãy B hàng 2 dòng 1 thứ 1')
	Insert into Book values ('aa-vo-001','','aac',1,0,getdate(),1,1,'dãy C hàng 2 dòng 5 thứ 3')