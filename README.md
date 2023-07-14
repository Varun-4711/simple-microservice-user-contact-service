# simple-microservice-user-contact-service
Its a simple microservice based project.
# Microservice Project

This repository contains a simple microservice-based project that consists of multiple services: User Service, Contact Service, API Gateway, Eureka Registry Service, and a Hystrix Dashboard. The project enables retrieving user contact information through the User Service and accessing contacts via the Contact Service using the user ID.

## Services

### User Service

The User Service provides user-related functionalities and allows retrieving contact information for various users. It interacts with the Contact Service to retrieve contacts based on user IDs.

### Contact Service

The Contact Service manages user contact information and provides access to contacts based on user IDs. It is accessed by the User Service to retrieve contacts for specific users.

### API Gateway

The API Gateway acts as a single entry point for all external client requests. It routes requests to the appropriate microservice based on the requested functionality.

### Eureka Registry Service

The Eureka Registry Service is a service registry and discovery server. It enables microservices to register themselves and discover other services in the system. The User Service, Contact Service, and API Gateway are registered with the Eureka Registry Service.

### Hystrix Dashboard

The Hystrix Dashboard provides a graphical interface for monitoring and visualizing the Hystrix metrics of various microservices. It helps in understanding the health and performance of individual services in the system.

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/your-repo.git`
2. Install the required dependencies for each service.
3. Start the Eureka Registry Service.
4. Start the User Service, Contact Service, and API Gateway, ensuring that they register with the Eureka Registry Service.
5. Start the Hystrix Dashboard.
6. Access the microservices through the API Gateway or directly, based on your requirements.


