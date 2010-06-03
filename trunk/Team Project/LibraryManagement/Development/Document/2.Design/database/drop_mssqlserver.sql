/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          database.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database drop script                            */
/* Created on:            2010-06-01 12:08                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Drop foreign key constraints                                           */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Book] DROP CONSTRAINT [Author_Book]
GO

ALTER TABLE [Book] DROP CONSTRAINT [Type_Book]
GO

ALTER TABLE [Book] DROP CONSTRAINT [Producers_Book]
GO

ALTER TABLE [CheckBook] DROP CONSTRAINT [Book_CheckBook]
GO

ALTER TABLE [CheckBook] DROP CONSTRAINT [Employee_CheckBook]
GO

ALTER TABLE [Users] DROP CONSTRAINT [Employee_Users]
GO

ALTER TABLE [sys_User_Function] DROP CONSTRAINT [Employee_sys_User_Function]
GO

ALTER TABLE [sys_User_Function] DROP CONSTRAINT [sys_Function_sys_User_Function]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Employee"                                                  */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Employee] DROP CONSTRAINT [PK_Employee]
GO

/* Drop table */

DROP TABLE [Employee]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Book"                                                      */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Book] DROP CONSTRAINT [PK_Book]
GO

/* Drop table */

DROP TABLE [Book]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "CheckBook"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [CheckBook] DROP CONSTRAINT [PK_CheckBook]
GO

/* Drop table */

DROP TABLE [CheckBook]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Users"                                                     */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Users] DROP CONSTRAINT [PK_Users]
GO

/* Drop table */

DROP TABLE [Users]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "sys_User_Function"                                         */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [sys_User_Function] DROP CONSTRAINT [PK_sys_User_Function]
GO

/* Drop table */

DROP TABLE [sys_User_Function]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "sys_Function"                                              */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [sys_Function] DROP CONSTRAINT [PK_sys_Function]
GO

/* Drop table */

DROP TABLE [sys_Function]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Author"                                                    */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Author] DROP CONSTRAINT [PK_Author]
GO

/* Drop table */

DROP TABLE [Author]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Type"                                                      */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Type] DROP CONSTRAINT [PK_Type]
GO

/* Drop table */

DROP TABLE [Type]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Producers"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Producers] DROP CONSTRAINT [PK_Producers]
GO

/* Drop table */

DROP TABLE [Producers]
GO
