-- Database schema for Online Examination System

CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);

CREATE TABLE questions (
    question_id INT PRIMARY KEY,
    question TEXT,
    correct_option INT
);
