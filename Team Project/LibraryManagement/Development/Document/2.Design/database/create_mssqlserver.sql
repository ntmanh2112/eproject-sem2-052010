/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          database.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2010-06-01 12:08                                */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Database                                                               */
/* ---------------------------------------------------------------------- */

create database librarymanagement

go

use librarymanagement

go

/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "Employee"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Employee] (
    [UserName] NVARCHAR(40) NOT NULL,
    [FullName] NVARCHAR(40),
    [Address] NVARCHAR(40),
    [PhoneNumber] NVARCHAR(40),
    [Department] NVARCHAR(40),
    [Statuts] BIT NOT NULL,
    CONSTRAINT [PK_Employee] PRIMARY KEY ([UserName])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Book"                                                       */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Book] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [CallNumber] NVARCHAR(40) NOT NULL,
    [ISBN] NVARCHAR(40) NOT NULL,
    [Title] NVARCHAR(40),
    [AuthorID] INTEGER NOT NULL,
    [statuts] BIT NOT NULL,
    [Last_updated_date] DATETIME,
    [TypeID] INTEGER NOT NULL,
    [ProducersID] INTEGER NOT NULL,
    [Address] NVARCHAR(40),
    CONSTRAINT [PK_Book] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "CheckBook"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [CheckBook] (
    [UserName] NVARCHAR(40) NOT NULL,
    [IDBooks] INTEGER NOT NULL,
    [DateCheckout] DATETIME,
    [DateCheckin] DATETIME,
    [DelateDate] NVARCHAR(40),
    CONSTRAINT [PK_CheckBook] PRIMARY KEY ([UserName], [IDBooks])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Users"                                                      */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Users] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [UserName] NVARCHAR(40) NOT NULL,
    [PassWord] NVARCHAR(40),
    [Last_updated_date] DATETIME,
    CONSTRAINT [PK_Users] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "sys_User_Function"                                          */
/* ---------------------------------------------------------------------- */

CREATE TABLE [sys_User_Function] (
    [UserName] NVARCHAR(40) NOT NULL,
    [IDFunction] INTEGER NOT NULL,
    CONSTRAINT [PK_sys_User_Function] PRIMARY KEY ([UserName], [IDFunction])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "sys_Function"                                               */
/* ---------------------------------------------------------------------- */

CREATE TABLE [sys_Function] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [FunctionName] NVARCHAR(40) NOT NULL,
    CONSTRAINT [PK_sys_Function] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Author"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Author] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [FullName] NVARCHAR(40),
    [Address] NVARCHAR(40),
    [Birthday] DATETIME,
    CONSTRAINT [PK_Author] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Type"                                                       */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Type] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] NVARCHAR(40),
    CONSTRAINT [PK_Type] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Producers"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Producers] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] NVARCHAR(40),
    [Address] NVARCHAR(40),
    CONSTRAINT [PK_Producers] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Book] ADD CONSTRAINT [Author_Book] 
    FOREIGN KEY ([AuthorID]) REFERENCES [Author] ([ID])
GO

ALTER TABLE [Book] ADD CONSTRAINT [Type_Book] 
    FOREIGN KEY ([TypeID]) REFERENCES [Type] ([ID])
GO

ALTER TABLE [Book] ADD CONSTRAINT [Producers_Book] 
    FOREIGN KEY ([ProducersID]) REFERENCES [Producers] ([ID])
GO

ALTER TABLE [CheckBook] ADD CONSTRAINT [Book_CheckBook] 
    FOREIGN KEY ([IDBooks]) REFERENCES [Book] ([ID])
GO

ALTER TABLE [CheckBook] ADD CONSTRAINT [Employee_CheckBook] 
    FOREIGN KEY ([UserName]) REFERENCES [Employee] ([UserName])
GO

ALTER TABLE [Users] ADD CONSTRAINT [Employee_Users] 
    FOREIGN KEY ([UserName]) REFERENCES [Employee] ([UserName])
GO

ALTER TABLE [sys_User_Function] ADD CONSTRAINT [Employee_sys_User_Function] 
    FOREIGN KEY ([UserName]) REFERENCES [Employee] ([UserName])
GO

ALTER TABLE [sys_User_Function] ADD CONSTRAINT [sys_Function_sys_User_Function] 
    FOREIGN KEY ([IDFunction]) REFERENCES [sys_Function] ([ID])
GO
