# Retail Management System

## Overview
The **Retail Management System** is a microservices-based application developed using **Java 17** and **Gradle 8.8**. It provides various services to manage different components of a retail business, such as products, orders, payments, users, and more. This system is designed for scalability and maintainability, utilizing modern microservice architecture principles.

## Features
- **Product Service**: Manages product details such as inventory, prices, and categories.
- **Order Service**: Handles customer orders, tracking, and order status.
- **Payment Service**: Manages payment transactions for orders.
- **Cart Service**: Manages the shopping cart and user items.
- **User Service**: Handles user accounts, authentication, and authorization.
- **Shipping Service**: Tracks and manages the shipping process.
- **Security Service**: Provides security features for the system.
- **API Gateway**: Acts as an entry point for all requests.
- **Discovery Service**: Handles service discovery within the microservices architecture.
- **Configuration Service**: Manages centralized configuration for the services.

## Requirements
- **Java 17**
- **Gradle 8.8**
- **Docker** (future implementation)

## Getting Started

### 1. Clone the repository
Clone the repository to your local machine:
```
git clone https://github.com/RajputAnkit11/retail-management-system.git
cd retail-management-system
```

### 2. Build the project
   This project uses Gradle for dependency management and building. Use the following command to build the project:

bash
Copy
./gradlew build
### 3. Run the services
   Each service in this system can be run independently using your preferred IDE or the command line. Refer to the respective service documentation for specific setup and running instructions.

### Docker (future implementation)
Docker implementation for containerization is yet to be integrated into the project. Once implemented, Docker will help in managing services in isolated containers, simplifying deployment and scalability.

### Contributing
Contributions are welcome! If you'd like to enhance the project or add new features, feel free to fork the repository and submit a pull request.

### License
This project is licensed under the MIT License.

