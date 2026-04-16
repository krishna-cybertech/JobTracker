# 📊 Job Application Tracker API

A secure and scalable RESTful API designed to help users efficiently track and manage their job applications. This application allows users to organize job opportunities, monitor application status, and streamline their job search process.

---

## 🚀 Features

* 🔐 **JWT-based Authentication & Authorization**
* 📌 **CRUD Operations for Job Applications**
* 📊 Track application status (Applied, Interview, Offer, Rejected)
* 👤 User-specific data management
* 🛡 Secure API endpoints using Spring Security
* ⚡ Efficient data handling with optimized database queries

---

## 🏗️ Tech Stack

* **Backend:** Java, Spring Boot
* **Security:** Spring Security, JWT
* **Database:** MySQL
* **ORM:** Spring Data JPA, Hibernate
* **Build Tool:** Maven
* **API Testing:** Postman

---

## 🧩 Architecture Overview

* Designed using **RESTful API principles**
* Layered architecture:

  * Controller Layer (Handles HTTP requests)
  * Service Layer (Business logic)
  * Repository Layer (Database interaction)
* Ensures **clean code, modularity, and scalability**

---

## 🔑 API Endpoints (Sample)

| Method | Endpoint       | Description              |
| ------ | -------------- | ------------------------ |
| POST   | /auth/register | Register new user        |
| POST   | /auth/login    | Authenticate user        |
| GET    | /jobs          | Get all job applications |
| POST   | /jobs          | Add new job              |
| PUT    | /jobs/{id}     | Update job status        |
| DELETE | /jobs/{id}     | Delete job               |

---

## ⚙️ Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/job-tracker-api.git
   ```

2. Configure MySQL database in `application.properties`

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Use Postman to test API endpoints

---

## 📈 Key Highlights

* Implemented **secure authentication using JWT**
* Designed scalable backend with **Spring Boot best practices**
* Handled user-specific data securely
* Built with focus on **performance, security, and maintainability**

---
## 👨‍💻 Author

**Lohith Krishna Killamsetty**
Java Full Stack Developer



---

## 📫 Contact

**Lohith Krishna**
📧 Email: [lohitkrishna511@gmail.com](mailto:lohitkrishna511@gmail.com)
💼 LinkedIn: https://www.linkedin.com/in/lohitkrishna

---

⭐ If you like this project, feel free to star the repository!
