# Prtf-e

Name: ProjectPal - Tinder for Open Source Projects 🔥
Project Overview: ProjectPal is a full-stack web application that helps developers discover open-source projects through an intuitive Tinder-like swipe interface. Built with modern technologies and best practices.

🚀 Tech Stack
Backend:

- Java 17 - Programming language
- Spring Boot 3.2.x - Application framework
- Spring Data JPA - Database ORM layer
- Spring Security - Authentication & authorization
- MySQL 8.0 - Database management
- Hibernate - JPA implementation
- Maven - Dependency management

Frontend (Upcoming):

- React - UI library
- Bootstrap - CSS framework
- Axios - HTTP client

📁 Project Structure
projectpal-backend/
├── src/main/java/com/portfolio/me/snapshot/
│ ├── controller/ # REST API controllers
│ ├── model/ # JPA entities (User, Project, Tag, Swipe)
│ ├── repository/ # Data access layer (JPA repositories)
│ ├── service/ # Business logic layer
│ │ ├── interface/ # Service interfaces
│ │ └── impl/ # Service implementations
│ ├── dto/ # Data Transfer Objects
│ │ ├── request/ # Input DTOs
│ │ └── response/ # Output DTOs
│ ├── config/ # Spring configuration classes
│ ├── security/ # Security configuration
│ ├── exception/ # Custom exception handling
│ └── util/ # Utility classes
├── src/main/resources/
│ └── application.properties # Database & application configuration
└── pom.xml # Maven dependencies

🗄️ Database Schema: Core Entities

- User - Developer accounts with profiles
- Project - Open source projects from GitHub
- Tag - Technologies and languages (React, Spring, etc.)
- Swipe - User interactions with projects (Like/Pass/Super-like)
- Match - Successful project-user matches

Key Features:

- Automatic table generation via Hibernate
- Data validation constraints
- Unique constraints on critical fields
- Timestamp auditing (createdAt, updatedAt)
- Proper JPA relationships (OneToMany, ManyToMany)

🛠️ Setup & Installation
Prerequisites:

- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.6+

Running the Application
bash

# Clone the repository

git clone https://github.com/Andre050101/Prtf-e.git

# Navigate to project directory

cd PRTF-E/snapshot

# Run the application

./mvnw spring-boot:run
The application will start on http://localhost:8080

🚧 In Progress:

- Repository interfaces
- Service layer implementation
- REST API controllers
- Spring Security configuration

Frontend React application: Key Features (Planned):

- 🔐 User authentication & authorization
- 👆 Swipe interface for project discovery
- 🏷️ Technology-based project filtering
- 💝 Match system for liked projects
- 📱 Responsive design for all devices

Advanced Features:

- 🎯 Personalized project recommendations
- ⭐ Project difficulty ratings (Beginner/Intermediate/Advanced)
- 🔔 Match notifications
- 📊 User activity analytics

🤝 Contributing
This is a portfolio project demonstrating full-stack development skills. While primarily for showcase purposes, suggestions and feedback are welcome!

📄 License
This project is open source and available under the MIT License.

Developed with ❤️ using Spring Boot & React

Part of my professional portfolio - Andrea

Last updated: 2025/11/22

This README will evolve as we continue developing the project! Next steps include implementing the repository layer, service classes, and REST controllers.
