/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          leavedata.dez                                   */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2010-05-29 13:09                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "USERID"                                                     */
/* ---------------------------------------------------------------------- */
IF EXISTS (SELECT * FROM SYS.DATABASES WHERE NAME = 'LeaveManagementSystem')
BEGIN 
	DROP DATABASE LeaveManagementSystem
END
GO
CREATE DATABASE LeaveManagementSystem
GO
USE LeaveManagementSystem
GO
IF EXISTS(SELECT * FROM  DBO.SYSOBJECTS WHERE NAME = 'USERID')
BEGIN
	DROP TABLE TBL_USER
END
CREATE TABLE [TBL_USER] (
    [ID_USER] INTEGER IDENTITY(1,1) NOT NULL,
    [USERNAME] NVARCHAR(20) NOT NULL,
    [PASSWORD] NVARCHAR(20) NOT NULL,
    [STATUS] VARCHAR(1) NOT NULL,   -- 1 TON TAI    0 NGHI
    [FULLNAME] NVARCHAR(50) NOT NULL,
    [BIRTHDAY] DATETIME NOT NULL,
    [ADDRESS] NVARCHAR(50) NOT NULL,
    [GENDER] NVARCHAR(6) NOT NULL,
    [PHONE] NVARCHAR(15) NOT NULL,
    [EMAIL] NVARCHAR(50) NOT NULL,
    [ID_POSITION] INTEGER NOT NULL,      
    CONSTRAINT [PK_USERID] PRIMARY KEY ([ID_USER])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "POSITION"                                                   */
/* ---------------------------------------------------------------------- */
IF EXISTS(SELECT * FROM  DBO.SYSOBJECTS WHERE NAME = 'TBL_POSITION')
BEGIN
	DROP TABLE TBL_POSITION
END
CREATE TABLE [TBL_POSITION] (
    [ID_POSITION] INTEGER IDENTITY(1,1) NOT NULL,
    [POSITION_NAME] NVARCHAR(30) NOT NULL,
    CONSTRAINT [PK_POSITION] PRIMARY KEY ([ID_POSITION])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "LEAVEAPP"                                                   */
/* ---------------------------------------------------------------------- */


IF EXISTS(SELECT * FROM  DBO.SYSOBJECTS WHERE NAME = 'TBL_LEAVEAPP')
BEGIN
	DROP TABLE TBL_LEAVEAPP
END
CREATE TABLE [TBL_LEAVEAPP] (
    [ID_LEAVEAPP] INTEGER IDENTITY(1,1) NOT NULL,
    [ID_USER] INT NOT NULL,
    [DATEFROM] DATETIME NOT NULL,
    [DATETO] DATETIME NOT NULL,
    [REASON] NVARCHAR(MAX) NOT NULL,
    [ADDRESS] NVARCHAR(50) NOT NULL,
    [PHONE] NVARCHAR(15) NOT NULL,
    [STATUSLEAVE] NVARCHAR(7) NOT NULL /* CO 3 TRANG THAI CHUA DUYET,APPROVE REJECT ,FINISH*/
    CONSTRAINT [PK_LEAVEAPP] PRIMARY KEY ([ID_LEAVEAPP])
)
GO
IF EXISTS(SELECT * FROM  DBO.SYSOBJECTS WHERE NAME = 'TBL_LEAVEDIRECTOR')
BEGIN
	DROP TABLE TBL_LEAVEDIRECTOR
END
CREATE TABLE [TBL_LEAVEDIRECTOR] (
    [ID_LEAVEDIRECTOR] INTEGER IDENTITY(1,1) NOT NULL,
    [DATEFROM] DATETIME NOT NULL,
    [DATETO] DATETIME NOT NULL,
    [REASON] NVARCHAR(MAX) NOT NULL,
    CONSTRAINT [PK_LEAVEDIRECTOR] PRIMARY KEY ([ID_LEAVEDIRECTOR])
)
GO


/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM  SYS.FOREIGN_KEYS WHERE NAME = 'FK_TBL_USER_TBL_LEAVEAPP')
BEGIN
	ALTER TABLE TBL_LEAVEAPP
	DROP CONSTRAINT FK_TBL_USER_TBL_LEAVEAPP
END
ALTER TABLE [TBL_LEAVEAPP] ADD CONSTRAINT [FK_TBL_USER_TBL_LEAVEAPP] 
    FOREIGN KEY ([ID_USER]) REFERENCES [TBL_USER] ([ID_USER])
GO
IF EXISTS (SELECT * FROM  SYS.FOREIGN_KEYS WHERE NAME = 'FK_TBL_USER_TBL_POSITION')
BEGIN
	ALTER TABLE TBL_USER
	DROP CONSTRAINT FK_TBL_USER_TBL_POSITION
END
ALTER TABLE [TBL_USER] ADD CONSTRAINT [FK_TBL_USER_TBL_POSITION] 
    FOREIGN KEY ([ID_POSITION]) REFERENCES [TBL_POSITION] ([ID_POSITION])
GO
INSERT INTO TBL_POSITION VALUES ('Engineer')
INSERT INTO TBL_POSITION VALUES ('Manager')
INSERT INTO TBL_POSITION VALUES ('Business Manager')
INSERT INTO TBL_POSITION VALUES ('Managing Director')
 

INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION) VALUES ('admin','admin','1','Managing Director','12/10/1981','28 A Le Loi Q 1 TPHCM','Nam','0903106256','hieu.itt01@gmail.com','4')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('smod','smod','1',' Manager Business','12/1/1990','1a Le Loi f11 q1','Nam','0903106258','dongho01@gmail.com','3')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('mod','mod','1','Manager','01/10/1984','140A Nguyen Thi Minh Khai f 14 Q 5','Nam','0903106257','dsnguyen@gmail.com','2')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('member','member','1','Engineer','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106256','hieu.itt01@gmail.com','1')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test','test','1','Nguyen Minh Triet','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106256','hieu.itt01@gmail.com','2')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test1','test1','0','Cao thai Son','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106111','hieu.itt01@gmail.com','1')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test2','test2','1','Huynh Van Banh','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903101236','hieu.itt01@gmail.com','2')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test3','test3','1','Le Lai','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903144456','Lelai@gmail.com','3')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test4','test4','1','Le loi','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0905466256','Leloi01@gmail.com','1')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test5','test5','1','Nguyen Minh','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106256','nguyenminh@gmail.com','2')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test6','test6','0','Tran Thai Hoa','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106111','Thaihoa@gmail.com','1')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test7','test7','1','Le Van sy','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903101236','Vansy@gmail.com','2')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test8','test8','1','Le Van Tam','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903144456','Vantam01@gmail.com','3')
INSERT INTO TBL_USER (USERNAME,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION)VALUES ('test9','test9','1','Cao Man Dat','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0905466256','mandat@gmail.com','1')

INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,ADDRESS,PHONE) VALUES (1,'05/31/2010','01/06/2010','tired','approve','28 A Le Loi Q 1 TPHCM','0903106256')
INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,ADDRESS,PHONE) VALUES (1,'05/05/2010','05/06/2010','tired','finish','28 A Le Loi Q 1 TPHCM','0903106256')
INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,ADDRESS,PHONE) VALUES (1,'06/05/2010','06/06/2010','tired','reject','28 A Le Loi Q 1 TPHCM','0903106256')
INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,ADDRESS,PHONE) VALUES (1,'06/05/2010','06/06/2010','tired','valid','28 A Le Loi Q 1 TPHCM','0903106256')
INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,ADDRESS,PHONE)VALUES (2,'05/20/2010','06/05/2010','tired','valid','28 A Le Loi Q 1 TPHCM','0903106256')
INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,ADDRESS,PHONE)VALUES (3,'07/20/2010','06/05/2010','tired','valid','28 A Le Loi Q 1 TPHCM','0903106256')

INSERT INTO TBL_LEAVEDIRECTOR (DATEFROM,DATETO,REASON) VALUES ('06/05/2010','06/06/2010','Christmas')
INSERT INTO TBL_LEAVEDIRECTOR (DATEFROM,DATETO,REASON) VALUES ('06/05/2010','06/06/2010','Easter')
INSERT INTO TBL_LEAVEDIRECTOR (DATEFROM,DATETO,REASON) VALUES ('06/05/2010','06/06/2010','Birthday Queen')
