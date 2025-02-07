# Bus Management System

## Overview
The Bus Management System is a Spring Boot application designed to manage bus schedules, bookings, and customer information. It provides RESTful APIs for adding, updating, deleting, and retrieving bus, schedule, and booking details.

## Technologies Used
- Java
- Spring Boot
- Maven
- JPA (Java Persistence API)
- Hibernate
- MySQL (or any other relational database)
- IntelliJ IDEA

## Project Structure
- `src/main/java/com/example/BusManagementSystem`
  - `controllers`: Contains the REST controllers for handling HTTP requests.
  - `entities`: Contains the entity classes representing the database tables.
  - `exceptions`: Contains custom exception classes and global exception handlers.
  - `repositories`: Contains the repository interfaces for data access.
  - `services`: Contains the service classes implementing the business logic.


## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- MySQL (or any other relational database)

## API Endpoints

### Bus Controller
- **POST** `/bus/addbus/{route_id}/{schedule_id}`: Add a new bus.
- **DELETE** `/bus/removebusbyid/{id}`: Remove a bus by ID.
- **GET** `/bus/getalldetails`: Get all bus details.
- **GET** `/bus/getbusbyid/{bus_id}`: Get bus details by ID.
- **PUT** `/bus/updatebus/{bus_id}`: Update bus details.

### Booking Controller
- **GET** `/booking/search/{source}/{destination}`: Search for buses by source and destination.
- **POST** `/booking/bookseats/{cust_id}/{date}/{bus_id}/{seats}`: Book seats on a bus.
- **DELETE** `/booking/deletebooking/{booking_id}`: Delete a booking by ID.

### Schedule Controller
- **POST** `/schedule/addschedule`: Add a new schedule.
- **GET** `/schedule/getallschedules`: Get all schedules.
- **GET** `/schedule/getschedulebyid/{schedule_id}`: Get schedule details by ID.
- **PUT** `/schedule/updateschedule/{schedule_id}`: Update schedule details.
- **DELETE** `/schedule/deleteschedulebyid/{schedule_id}`: Delete a schedule by ID.

### Route Controller
- **POST** `/route/addroute`: Add a new route.
- **GET** `/route/getallroutes`: Get all routes.
- **GET** `/route/getroutebyid/{route_id}`: Get route details by ID.
- **PUT** `/route/updateroute/{route_id}`: Update route details.
- **DELETE** `/route/deleteroutebyid/{route_id}`: Delete a route by ID.

### Customer Controller
- **POST** `/customer/addcustomer`: Add a new customer.
- **GET** `/customer/viewAllCustomers`: Get all customers.
- **GET** `/customer/getcustomerbyid/{cust_id}`: Get customer details by ID.
- **PUT** `/customer/updatecustomer/{cust_id}`: Update customer details.
- **DELETE** `/customer/deletecustomerbyid/{cust_id}`: Delete a customer by ID.
- **DELETE** `/customer/deleteallcustomers`: Delete all customers.
- **GET** `/customer/getcustomersbyemail/{email}`: Get customer details by email.

### Exception Handling
The application uses a global exception handler to manage exceptions and provide appropriate HTTP status codes and messages.

