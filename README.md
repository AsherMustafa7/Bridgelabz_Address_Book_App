# Bridgelabz Address Book App

A Spring Boot REST API for managing personal contacts (create, view, update, delete), developed using Java and Maven for the BridgeLabz backend track.

## Overview

This application provides a clean, layered REST backend for an Address Book:

- **Controller layer** (`AddressBookController`) — exposes HTTP endpoints under `/addressbook` and returns structured `ResponseEntity` responses.
- **Service layer** (`AddressBookService` / `AddressBookServiceImpl`) — manages contact lifecycle operations in an in-memory `ArrayList` with auto-incremented IDs and SLF4J logging.
- **DTO, Model & Mapper** (`AddressBookDTO`, `AddressBook`, `AddressBookMapper`) — keeps API payloads cleanly separated from internal domain models.
- **Exception Handling** (`ContactNotFoundException`, `GlobalExceptionHandler`) — converts missing-contact lookups into clean `404 Not Found` JSON error responses via `@RestControllerAdvice`.

## Tech Stack

- **Language:** Java 21 (built & verified on JDK 25)
- **Framework:** Spring Boot 4.1.2 (Web, DevTools)
- **Build Tool:** Maven
- **Database Driver:** MySQL Connector/J (preconfigured for database integration)
- **Testing:** JUnit 5 & Mockito
- **Logging:** SLF4J

## Directory Layout

```text
Bridgelabz_Address_Book_App/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/addressbook/
    │   │   ├── AddressBookApplication.java
    │   │   ├── controller/AddressBookController.java
    │   │   ├── dto/AddressBookDTO.java
    │   │   ├── exception/
    │   │   │   ├── ContactNotFoundException.java
    │   │   │   └── GlobalExceptionHandler.java
    │   │   ├── mapper/AddressBookMapper.java
    │   │   ├── model/AddressBook.java
    │   │   └── service/
    │   │       ├── AddressBookService.java
    │   │       └── AddressBookServiceImpl.java
    │   └── resources/application.properties
    └── test/
        └── java/com/addressbook/
            ├── AddressbookApplicationTests.java
            ├── controller/AddressBookControllerTest.java
            ├── dto/AddressBookDTOTest.java
            ├── exception/
            │   ├── ContactNotFoundExceptionTest.java
            │   └── GlobalExceptionHandlerTest.java
            ├── mapper/AddressBookMapperTest.java
            ├── model/AddressBookTest.java
            └── service/AddressBookServiceImplTest.java
```

## Use Cases & Feature Branches

`main` holds only this README. Active development lives on `develop`, with each use case implemented in its own feature branch and merged back into `develop`:

| Branch | Use Case | Summary |
|---|---|---|
| `feature/Section1-UC1-Setup` | Section 1 – UC1 | Initialized Spring Boot application, Maven setup, and configuration properties |
| `feature/Section1-UC2-Rest-Controller` | Section 1 – UC2 | Implemented `AddressBookController` with CRUD endpoints and SLF4J logging |
| `feature/Section2-UC1-DTOModel` | Section 2 – UC1 | Added `AddressBookDTO`, `AddressBook` model, `AddressBookMapper`, and unit tests |
| `feature/Section2-UC2-Service-Layer` | Section 2 – UC2 | Introduced `AddressBookService` interface and implementation with constructor injection |
| `feature/Section2-UC3-In-Memory-Storage` | Section 2 – UC3 | Added in-memory `ArrayList` persistence, `ContactNotFoundException`, global error handler, and full unit tests |

## REST API Reference

Base URL: `http://localhost:8080/addressbook`

| Method | Endpoint | Action | Status Codes |
|---|---|---|---|
| `GET` | `/` | Retrieve all contacts | `200 OK` |
| `GET` | `/get/{id}` | Retrieve a contact by ID | `200 OK`, `404 Not Found` |
| `POST` | `/create` | Create a new contact | `201 Created` |
| `PUT` | `/update/{id}` | Update an existing contact | `200 OK`, `404 Not Found` |
| `DELETE` | `/delete/{id}` | Delete a contact by ID | `200 OK`, `404 Not Found` |

### Sample Request Body (`POST /create` & `PUT /update/{id}`)

```json
{
  "firstName": "Asher",
  "lastName": "Mustafa",
  "phoneNumber": "9876543210"
}
```

## Getting Started

1. Clone the repository and switch to `develop`:
   ```bash
   git clone https://github.com/AsherMustafa7/Bridgelabz_Address_Book_App.git
   cd Bridgelabz_Address_Book_App
   git checkout develop
   ```
2. Make sure JDK 21+ (e.g., JDK 25) is active, then start the app:
   ```bash
   mvn spring-boot:run
   ```

## Running Tests

Run the full suite of 24 JUnit 5 & Mockito tests:

```bash
mvn test
```

## Author

**Asher Mustafa** — [GitHub (@AsherMustafa7)](https://github.com/AsherMustafa7)
