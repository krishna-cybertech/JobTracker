📌 Job Application Tracker API
🚀 Overview

A secure and scalable Job Application Tracking System built using Spring Boot.
This application allows users to efficiently manage, track, and update their job applications with real-time status monitoring and secure authentication.

🛠️ Tech Stack
💻 Programming Languages
Java
SQL
⚙️ Backend
Spring Boot
Spring Security
Spring Data JPA
Hibernate ORM
Maven
🗄️ Database
MySQL
🧰 Tools
Postman
GitHub
🔐 Security Features
JWT-based authentication & authorization
Secure REST API endpoints
Stateless session management
Role-based access control
✨ Key Features
📌 Job Management
Create, update, delete job applications
Track company, role, and status
📊 Status Tracking
Applied
Interview
Offer
Rejected
🔍 Search & Filter
Filter by status or role
📅 Application Tracking
Track dates and maintain history
🧱 Architecture

Follows a layered architecture:

Controller → Service → Repository → Database
📂 Project Structure
job-tracker/
│
├── controller/
├── service/
├── repository/
├── model/
├── dto/
├── security/
├── exception/
└── config/
🔑 API Endpoints
🔐 Authentication
POST /api/auth/register
POST /api/auth/login
📌 Job Applications
GET    /api/jobs
POST   /api/jobs
GET    /api/jobs/{id}
PUT    /api/jobs/{id}
DELETE /api/jobs/{id}
⚙️ Setup Instructions
1️⃣ Clone Repository
git clone https://github.com/your-username/job-tracker.git
cd job-tracker
2️⃣ Configure Database
spring.datasource.url=jdbc:mysql://localhost:3306/job_tracker
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
3️⃣ Run Application
mvn spring-boot:run
🔒 Authentication Flow
Register user
Login → get JWT token
Use token in headers:
Authorization: Bearer <your_token>
🧪 Testing

Use Postman to test all API endpoints.

🎯 Highlights
Secure backend using Spring Security + JWT
Clean layered architecture
Real-world use case
RESTful API design
👨‍💻 Author

Lohith Krishna Killamsetty
