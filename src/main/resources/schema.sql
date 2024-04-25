CREATE TABLE task ( 
   id INT NOT NULL AUTO_INCREMENT, 
   title VARCHAR(50) NOT NULL,
   description VARCHAR(255),
   from_date DATE,
   to_date DATE
);