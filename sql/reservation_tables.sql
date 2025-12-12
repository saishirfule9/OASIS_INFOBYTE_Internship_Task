-- Basic schema for reservations (MySQL syntax)
CREATE TABLE reservations (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(120),
  train_number VARCHAR(50),
  travel_date DATE,
  class_type VARCHAR(50),
  from_place VARCHAR(100),
  to_place VARCHAR(100),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
