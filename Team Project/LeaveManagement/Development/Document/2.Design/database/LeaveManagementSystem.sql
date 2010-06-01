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
IF EXISTS(SELECT * FROM  DBO.SYSOBJECTS WHERE NAME = 'TBL_USER')
BEGIN
	DROP TABLE TBL_USER
END
CREATE TABLE [TBL_USER] (
    [ID_USER] INTEGER IDENTITY(1,1) NOT NULL,
    [USERNAME] NVARCHAR(20) NOT NULL,
    [PASSWORD] NVARCHAR(20) NOT NULL,
    [STATUS] VARCHAR(1) NOT NULL,         -- 1 TON TAI    0 NGHI
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
    [CREATE_ID] NVARCHAR(20) NOT NULL,
    [DATEFROM] DATETIME NOT NULL,
    [DATETO] DATETIME NOT NULL,
    [REASON] NVARCHAR(MAX) NOT NULL,
    [STATUS] NVARCHAR(1),
    [REVIEWER_ID] NVARCHAR(20),
    [REJECT_MSG] NVARCHAR(1000),
	[LASTUPDATE] DATETIME NOT NULL,    
    CONSTRAINT [PK_LEAVEAPP] PRIMARY KEY ([ID_LEAVEAPP])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "EMPLOYEE"                                                   */
/* ---------------------------------------------------------------------- */
IF EXISTS(SELECT * FROM  DBO.SYSOBJECTS WHERE NAME = 'TBL_EMPLOYEE')
BEGIN
	DROP TABLE TBL_EMPLOYEE
END
CREATE TABLE [TBL_EMPLOYEE] (
    [USERNAME] NVARCHAR(20) NOT NULL,
    [FULLNAME] NVARCHAR(50) NOT NULL,
    [BIRTHDAY] DATETIME NOT NULL,
    [ADDRESS] NVARCHAR(50) NOT NULL,
    [GENDER] NVARCHAR(6) NOT NULL,
    [PHONE] NVARCHAR(15) NOT NULL,
    [EMAIL] NVARCHAR(50) NOT NULL,
    [START] DATETIME NOT NULL,     
    [POSITION_ID] INTEGER NOT NULL,
   
    CONSTRAINT [PK_EMPLOYEE] PRIMARY KEY ([USERNAME])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */
IF EXISTS (SELECT * FROM  SYS.FOREIGN_KEYS WHERE NAME = 'FK_EMPLOYEE_USERID')
BEGIN
	ALTER TABLE TBL_USERID
	DROP CONSTRAINT FK_EMPLOYEE_USERID
END
ALTER TABLE [TBL_USER] ADD CONSTRAINT [FK_EMPLOYEE_USER] 
    FOREIGN KEY ([USERNAME]) REFERENCES [TBL_EMPLOYEE] ([USERNAME])
GO
IF EXISTS (SELECT * FROM  SYS.FOREIGN_KEYS WHERE NAME = 'FK_EMPLOYEE_LEAVEAPP')
BEGIN
	ALTER TABLE TBL_LEAVEAPP
	DROP CONSTRAINT FK_EMPLOYEE_LEAVEAPP
END
ALTER TABLE [TBL_LEAVEAPP] ADD CONSTRAINT [FK_EMPLOYEE_LEAVEAPP] 
    FOREIGN KEY ([CREATE_ID]) REFERENCES [TBL_EMPLOYEE] ([USERNAME])
GO
IF EXISTS (SELECT * FROM  SYS.FOREIGN_KEYS WHERE NAME = 'FK_EMPLOYEE_POSITION')
BEGIN
	ALTER TABLE TBL_EMPLOYEE
	DROP CONSTRAINT FK_EMPLOYEE_POSITION
END
ALTER TABLE [TBL_EMPLOYEE] ADD CONSTRAINT [FK_EMPLOYEE_POSITION] 
    FOREIGN KEY ([POSITION_ID]) REFERENCES [TBL_POSITION] ([ID_POSITION])
GO
INSERT INTO TBL_POSITION VALUES ('Engineer')
INSERT INTO TBL_POSITION VALUES ('Manager')
INSERT INTO TBL_POSITION VALUES ('Business Manager')
INSERT INTO TBL_POSITION VALUES ('Managing Director')

INSERT INTO TBL_EMPLOYEE VALUES('hieupham','Pham Trung Hieu','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106256','hieu.itt01@gmail.com','01/01/2000','1')
INSERT INTO TBL_EMPLOYEE VALUES('dongho','Nguyen Dong Ho','12/1/1990','1a Le Loi f11 q1','Nam','0903106258','dongho01@gmail.com','02/03/2001','2')
INSERT INTO TBL_EMPLOYEE VALUES('singuyen','Dinh Sy Nguyen','01/10/1984','140A Nguyen Thi Minh Khai f 14 Q 5','Nam','0903106257','dsnguyen@gmail.com','09/03/2004','3')
INSERT INTO TBL_EMPLOYEE VALUES('haiau','pham hieu','12/10/1981','140A Me Coc F 15 Q8 TPHCM','Nam','0903106256','hieu.itt01@gmail.com','01/01/1999','4')

INSERT INTO TBL_USER VALUES ('hieupham','123456','1')
INSERT INTO TBL_USER VALUES ('singuyen','123456','1')
INSERT INTO TBL_USER VALUES ('dongho','123456','1')

INSERT INTO TBL_LEAVEAPP VALUES ('hieupham','05/31/2010','01/06/2010','tired','4','singuyen','no','06/01/2010')
INSERT INTO TBL_LEAVEAPP VALUES ('dongho','05/20/2010','06/05/2010','tired','4','singuyen','no','06/01/2010')
INSERT INTO TBL_LEAVEAPP VALUES ('dongho','05/01/2010','05/06/2010','tired','4','singuyen','no','06/01/2010')

