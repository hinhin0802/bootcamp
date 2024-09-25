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

INSERT INTO regions (region_id, region_name)
VALUES
(1, 'North America'),
(2, 'South America');

INSERT INTO countries (country_id, country_name, region_id)
VALUES
('US', 'United States', 1),
('CA', 'Canada', 1);

INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
VALUES
(1, '123 Main St', '12345', 'New York', 'New York', 'US'),
(2, '456 Elm St', '90210', 'Los Angeles', 'California', 'US');

INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES
(1, 'Sales', 101, 1),
(2, 'Marketing', 102, 2);

INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
VALUES
('SALESREP', 'Sales ', 40000.00, 80000.00),
('SALESREP2', 'Senior Sales', 60000.00, 100000.00);

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
VALUES
(101, 'John', 'Smith', 'john.smith@example.com', '123-456-7890', '2010-01-01', 'SALESREP', 60000.00, 0.10, 100, 1),
(102, 'Jane', 'Doe', 'jane.doe@example.com', '987-654-3210', '2012-01-01', 'MARKETINGREP', 70000.00, 0.15, 100, 2);

INSERT INTO job_history (employee_id, start_date, end_date, job_id, department_id)
VALUES
(101, '2010-01-01', '2015-12-31', 'SALESREP', 1),
(101, '2016-01-01', '2020-12-31', 'SALESREP2', 1);
