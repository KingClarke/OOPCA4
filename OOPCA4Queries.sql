DROP DATABASE IF EXISTS records;
CREATE DATABASE records;

DROP TABLE IF EXISTS expenses;
CREATE TABLE expenses (
    expenseID INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR() NOT NULL,
    category VARCHAR(255) NOT NULL,
    amount DOUBLE NOT NULL,
    dateIncurred DATE NOT NULL);

DROP TABLE IF EXISTS income;
CREATE TABLE income (
    incomeID INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    amount DOUBLE NOT NULL,
    dateEarned DATE NOT NULL);