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
* `phone` (VARCHAR, Not Null)

### 3. appointments Table
* `id` (BIGINT, Primary Key, Auto Increment)
* `doctor_id` (BIGINT, Foreign Key referencing doctors.id)
* `patient_id` (BIGINT, Foreign Key referencing patients.id)
* `appointment_date` (DATETIME, Not Null)
* `status` (VARCHAR, Not Null)

### 4. prescriptions Table
* `id` (BIGINT, Primary Key, Auto Increment)
* `appointment_id` (BIGINT, Foreign Key referencing appointments.id)
* `medication` (VARCHAR, Not Null)
* `dosage` (VARCHAR, Not Null)

## Explicit Foreign Key Constraints
* `ALTER TABLE appointments ADD CONSTRAINT fk_appointment_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(id);`
* `ALTER TABLE appointments ADD CONSTRAINT fk_appointment_patient FOREIGN KEY (patient_id) REFERENCES patients(id);`
* `ALTER TABLE prescriptions ADD CONSTRAINT fk_prescription_appointment FOREIGN KEY (appointment_id) REFERENCES appointments(id);`

## Entity Relationships
* **Doctor to Appointments:** One-to-Many relationship mapping.
* **Patient to Appointments:** One-to-Many relationship mapping.
* **Appointment to Prescriptions:** One-to-One structural mapping.
