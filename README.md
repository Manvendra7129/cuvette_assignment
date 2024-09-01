

---

# Banking Application

This project is a web-based banking application that allows users to view bank branches and services offered by various banks in Bangalore. The application is built using Spring Boot and Thymeleaf for the backend and frontend, respectively, with MySQL as the database.

## Technologies Used

- **Spring Boot**: Backend framework for building Java-based web applications and REST APIs.
- **Thymeleaf**: Template engine for rendering dynamic HTML pages.
- **MySQL**: Relational database management system for storing bank data.
- **Lombok**: Java library to reduce boilerplate code (e.g., getters, setters, constructors).

## APIs

### Bank Branches API

- **Endpoint**: `/bank/{bankName}/branches`
- **Method**: `GET`
- **Description**: Retrieves a list of branches and their addresses for the specified bank in Bangalore.
- **Parameters**:
  - `bankName` (Path Variable): The name of the bank (e.g., "state bank of india").
- **Response**: 
  - A list of bank branches and their addresses.
- **Example Request**: 
  ```bash
  GET /bank/state%20bank%20of%20india/branches
  ```
- **Example Response**:
  ```json
  [
    {
      "branchName": "MG Road",
      "address": "MG Road, Bangalore, Karnataka"
    },
    {
      "branchName": "Indiranagar",
      "address": "100 Feet Road, Indiranagar, Bangalore, Karnataka"
    }
  ]
  ```

### Bank Services API

- **Endpoint**: `/bank/{bankName}/services`
- **Method**: `GET`
- **Description**: Retrieves a list of services offered by the specified bank.
- **Parameters**:
  - `bankName` (Path Variable): The name of the bank (e.g., "state bank of india").
- **Response**: 
  - A list of bank services such as savings accounts, loans, credit cards, etc.
- **Example Request**: 
  ```bash
  GET /bank/state%20bank%20of%20india/services
  ```
- **Example Response**:
  ```json
  [
    {
      "serviceName": "Savings Account",
      "description": "A basic savings account with interest."
    },
    {
      "serviceName": "Personal Loan",
      "description": "Loan options for personal expenses."
    }
  ]
  ```

## Project Setup

### Prerequisites

- **JDK 17 or higher**
- **Maven**
- **MySQL**
- **IDE** (IntelliJ IDEA or Spring Tool Suite)

### Clone the Repository

```bash
git clone https://github.com/Manvendra7129/banking-application.git
cd banking-application
```

### Database Setup

1. Create a MySQL database named `bankingdb`.
2. Update the `application.properties` file with your MySQL username and password.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bankingdb
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   ```



### Access the Application

You can access it through the following links:

- **View Bank Branches in Bangalore**: [branches](https://cuvetteassignment-production.up.railway.app/bank/state%20bank%20of%20india/branches)
- **View Bank Services Offered**: [services](https://cuvetteassignment-production.up.railway.app/bank/state%20bank%20of%20india/services)

### Project Structure

- **Controller**: Handles HTTP requests and responses (`BankController.java`).
- **Service**: Contains business logic (`BankService.java`).
- **Entity**: Represents database tables (`Branch.java`, `BankServiceOffering.java`).
- **Repository**: Data access layer interfaces extending `JpaRepository`.

### Further Enhancements

- **Input Validation**: Ensure that the input parameters (e.g., `bankName`) are valid.
- **Error Handling**: Implement custom error pages or messages for scenarios where no data is found.
- **Logging**: Incorporate logging for better monitoring and debugging.

---


