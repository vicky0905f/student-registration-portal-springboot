# student-registration-portal-springboot
A full-stack web application for managing student records using Spring Boot, Java, and SQL.
# Data Sticks - Student Registration Portal

Data Sticks is a full-stack web application designed to streamline the process of collecting and managing student information. Built with **Spring Boot**, this platform provides a clean, user-friendly interface for educational institutions to maintain a comprehensive database of student records.

## 🚀 Features
* **Student Registration:** Easy-to-use form to capture ID, Name, Age, Department, and CGPA.
* **Records Management:** A centralized "Student List" view to monitor all registered data.
* **CRUD Operations:** Fully functional Create, Read, Update, and Delete capabilities.
* **Responsive UI:** A modern, "Pinterest-inspired" aesthetic with a cinematic background.
* **Dynamic Feedback:** Confirmation screens upon successful data submission.

## 🛠️ Tech Stack
* **Backend:** Java, Spring Boot
* **Frontend:** HTML5, CSS3, JavaScript (Thymeleaf)
* **Database:** MySQL 
* **Tools:** Maven, IntelliJ IDEA / Vs code.

## 📸 Screenshots

### 1. Home / Registration Portal
![Registration Page](https://github.com/vicky0905f/student-registration-portal-springboot/blob/7e87a6459e0bc6d1d9bd3e1dedf98b6e88640a6f/Home.png)
*The main landing page where student details are entered.*

### 2. Registered Data (Student List)
![Student List](https://github.com/vicky0905f/student-registration-portal-springboot/blob/abf666535282c241846111e04bace987ed384fde/list.png)
*A comprehensive table view of all records with options to edit or delete.*

### 3. Edit Record
![Edit Page](https://github.com/vicky0905f/student-registration-portal-springboot/blob/abf666535282c241846111e04bace987ed384fde/edit.png)
*Allows administrators to update existing student information seamlessly.*

### 4. Submission Confirmation
![Success Page](https://github.com/vicky0905f/student-registration-portal-springboot/blob/main/Submitted.png?raw=true)
*User feedback after successful data persistence.*

## ⚙️ Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/student-registration-portal-springboot.git](https://github.com/your-username/student-registration-portal-springboot.git)
   
   Configure Database:
Update src/main/resources/application.properties with your SQL database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password

   Run the Application:
Navigate to the project root and run:
mvn spring-boot:run

   Access the Portal:
Open your browser and go to http://localhost:8080
