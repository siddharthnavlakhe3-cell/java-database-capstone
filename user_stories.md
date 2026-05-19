# Smart Clinic Management System - User Stories

## 1. Admin Features (Priority & Estimation)

* **User Story 1: Register New Doctor**
  * **As an Admin,** I want to add a new doctor to the system so that they can be registered under a medical specialty.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:**
    * Admin must fill name, specialty, and unique email.
    * System validates email format and prevents duplicate entries.

* **User Story 2: Update Database Configs**
  * **As an Admin,** I want to manage database configurations to keep user data secure.
  * **Priority:** High
  * **Story Points:** 3
  * **Acceptance Criteria:**
    * System allows changing the database connection URL and credentials via an encrypted profile file.

* **User Story 3: Deactivate Doctor Profile**
  * **As an Admin,** I want to temporarily deactivate a doctor's account if they leave the clinic.
  * **Priority:** Medium
  * **Story Points:** 3
  * **Acceptance Criteria:**
    * Deactivated doctors can no longer log in or accept appointments.

* **User Story 4: View System Logs**
  * **As an Admin,** I want to check access logs to monitor system activity.
  * **Priority:** Low
  * **Story Points:** 2
  * **Acceptance Criteria:**
    * A historical view displays user IDs and timestamps of log-ins.

* **User Story 5: Generate System Billing Summary**
  * **As an Admin,** I want to see a billing summary of all appointments processed to manage clinic revenue.
  * **Priority:** Medium
  * **Story Points:** 5
  * **Acceptance Criteria:**
    * Admin can select a date range and extract total clinic income metrics.

## 2. Doctor Features

* **User Story 6: View Appointment List**
  * **As a Doctor,** I want to view a list of all my patient appointments so that I can prepare for the day.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:**
    * System lists appointments filtered chronologically for the logged-in doctor.

* **User Story 7: Issue Prescriptions**
  * **As a Doctor,** I want to issue prescriptions during user visits.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:**
    * Digital form allows appending medication lists directly to an active appointment session.

* **User Story 8: Set Availability Hours**
  * **As a Doctor,** I want to adjust my shift timings so patients know when to book.
  * **Priority:** Medium
  * **Story Points:** 3
  * **Acceptance Criteria:**
    * Changes update real-time visibility on patient-facing booking dashboards.

## 3. Patient Features

* **User Story 9: Create Account**
  * **As a Patient,** I want to register a new account with my personal details.
  * **Priority:** High
  * **Story Points:** 3
  * **Acceptance Criteria:**
    * Account creation requires name, unique email, and password hashing.

* **User Story 10: Search Doctor by Name**
  * **As a Patient,** I want to search and find a doctor by name so that I can book a slot.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:**
    * Dynamic search bar filters doctors globally across names and specialties.

* **User Story 11: View Booked Appointments**
  * **As a Patient,** I want to retrieve all appointments booked by me using my login credentials.
  * **Priority:** Medium
  * **Story Points:** 3
  * **Acceptance Criteria:**
    * Secure access lists historical and upcoming consultations after standard user validation.
