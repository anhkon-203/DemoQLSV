CREATE DATABASE QLYSINHVIEN
GO 
USE
QLYSINHVIEN
GO 

CREATE TABLE SINH_VIEN(
	id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	ten_sinh_vien NVARCHAR(100),
	diem INT,
	gioi_tinh INT,
	lop NVARCHAR(50)
)
SELECT * FROM dbo.SINH_VIEN 