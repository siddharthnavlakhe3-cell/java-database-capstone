# Database Schema Design

## Tables and Column Definitions

### 1. doctors Table
* `id` (BIGINT, Primary Key, Auto Increment)
* `name` (VARCHAR, Not Null)
* `specialty` (VARCHAR, Not Null)
* `email` (VARCHAR, Unique, Not Null)

### 2. patients Table
* `id` (BIGINT, Primary Key, Auto Increment)
* `name` (VARCHAR, Not Null)
* `email` (VARCHAR, Unique, Not Null)
* `password` (VARCHAR, Not Null)

### 3. appointments Table
* `id` (BIGINT, Primary Key, Auto Increment)
* `doctor_id` (BIGINT, Foreign Key referencing doctors)
* `patient_id` (BIGINT, Foreign Key referencing patients)
* `appointment_date` (DATETIME, Not Null)
* `status` (VARCHAR, Not Null)

## Entity Relationships
* **Doctor to Appointments:** One-to-Many (Ek doctor ke kai appointments ho sakte hain).
* **Patient to Appointments:** One-to-Many (Ek patient kai appointments book kar sakta hai).
