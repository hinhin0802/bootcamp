Create database exerise1;
use exerise1;
CREATE TABLE regions (
  region_id INT PRIMARY KEY,
  region_name VARCHAR(25)
);

CREATE TABLE countries (
  country_id CHAR(2) PRIMARY KEY,
  country_name VARCHAR(40),
  region_id INT,
  FOREIGN KEY (region_id) REFERENCES regions (region_id)
);

CREATE TABLE locations (
  location_id INT PRIMARY KEY,
  street_address VARCHAR(25),
  postal_code VARCHAR(12),
  city VARCHAR(30),
  state_province VARCHAR(12),
  country_id CHAR(2),
  FOREIGN KEY (country_id) REFERENCES countries (country_id)
);

CREATE TABLE departments (
  department_id INT PRIMARY KEY,
  department_name VARCHAR(30),
  manager_id INT,
  location_id INT,
  FOREIGN KEY (location_id) REFERENCES locations (location_id)
);

CREATE TABLE jobs (
  job_id VARCHAR(10) PRIMARY KEY,
  job_title VARCHAR(35),
  min_salary DECIMAL(10, 2),
  max_salary DECIMAL(10, 2)
);

CREATE TABLE employees (
  employee_id INT PRIMARY KEY,
  first_name VARCHAR(20),
  last_name VARCHAR(25),
  email VARCHAR(25),
  phone_number VARCHAR(20),
  hire_date DATE,
  job_id VARCHAR(10),
  salary DECIMAL(10, 2),
  commission_pct DECIMAL(5, 2),
  manager_id INT,
  department_id INT,
  FOREIGN KEY (job_id) REFERENCES jobs (job_id),
  FOREIGN KEY (department_id) REFERENCES departments (department_id),
  FOREIGN KEY (manager_id) REFERENCES employees (employee_id)
);

CREATE TABLE job_history (
  employee_id INT,
  start_date DATE,
  end_date DATE,
  job_id VARCHAR(10),
  department_id INT,
  PRIMARY KEY (employee_id, start_date),
  FOREIGN KEY (employee_id) REFERENCES employees (employee_id),
  FOREIGN KEY (job_id) REFERENCES jobs (job_id),
  FOREIGN KEY (department_id) REFERENCES departments (department_id)
);

-- Insert data into regions table
INSERT INTO regions (region_id, region_name)
VALUES
(1, 'North America'),
(2, 'South America'),
(3, 'Europe'),
(4, 'Asia'),
(5, 'Africa'),
(6, 'Australia');

-- Insert data into countries table
INSERT INTO countries (country_id, country_name, region_id)
VALUES
('US', 'United States', 1),
('CA', 'Canada', 1),
('BR', 'Brazil', 2),
('FR', 'France', 3),
('DE', 'Germany', 3),
('CN', 'China', 4),
('IN', 'India', 4),
('ZA', 'South Africa', 5),
('AU', 'Australia', 6);

-- Insert data into locations table
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
VALUES
(1, '123 Main St', '12345', 'New York', 'New York', 'US'),
(2, '456 Elm St', '90210', 'Los Angeles', 'California', 'US'),
(3, '789 Oak St', 'M5V 1K4', 'Toronto', 'Ontario', 'CA'),
(4, '321 Pine St', '12345', 'Paris', 'Ile-de-France', 'FR'),
(5, '901 Maple St', '12345', 'Berlin', 'Berlin', 'DE'),
(6, '1111 Broadway', '12345', 'Shanghai', 'Shanghai', 'CN'),
(7, '2222 Wall St', '12345', 'Mumbai', 'Maharashtra', 'IN'),
(8, '3333 Park Ave', '12345', 'Cape Town', 'Western Cape', 'ZA'),
(9, '4444 Bondi Rd', '12345', 'Sydney', 'New South Wales', 'AU');

-- Insert data into departments table
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES
(1, 'Sales', 101, 1),
(2, 'Marketing', 102, 2),
(3, 'IT', 103, 3),
(4, 'Finance', 104, 4),
(5, 'HR', 105, 5),
(6, 'Operations', 106, 6),
(7, 'Research', 107, 7),
(8, 'Development', 108, 8),
(9, 'Support', 109, 9);