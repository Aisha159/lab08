# Maintainability Lab (Labb08)

## Lab Overview
This project contains four tasks related to software maintainability, clean code, validation, structured tracing, and automated testing.

## Tasks Description

### Task 1 – Refactoring Legacy Code
Refactored legacy code using interfaces and dependency injection. Separate formatters (`PdfFormatter` and `CsvFormatter`) and notification services (`EmailNotifier`) were created to improve flexibility and maintainability.

### Task 2 – Fail-Fast and Immutable Boundaries
Implemented an immutable `BankTransfer` record. Input validation ensures that account details and transfer amounts are valid. Invalid amounts are rejected immediately.

### Task 3 – Structured Tracing
Implemented a simple console-based tracing mechanism using transaction IDs. A `try-finally` block ensures that the tracing context is cleared after processing.

### Task 4 – Automated Quality Gate (JUnit 5)
Implemented a billing service using the `DiscountPolicy` interface and `VipDiscount` class. Added a JUnit 5 test to verify that the VIP discount is applied correctly without accessing a database.

## Technologies Used
- Java
- Apache NetBeans
- Maven
- JUnit 5
- Git and GitHub

## How to Run the Project

1. Clone or download this repository.
2. Open Apache NetBeans.
3. Select **File → Open Project**.
4. Browse to the `Labb08` project folder and open it.
5. Allow Maven to load the project dependencies.
6. To run an individual task, open its `Main.java` file.
7. Right-click the file and select **Run File** (or press `Shift + F6`).

### Running Task 1
Run `Task1.Main`.

### Running Task 2
Run `Task2.Main`. The negative transfer amount is intentionally used to demonstrate validation.

### Running Task 3
Run `Task3.Main`.

### Running Task 4 Tests
Right-click `OrderServiceTest.java` and select **Test File**, or right-click the project and select **Test**.

## Project Structure

- `Task1` – Legacy code refactoring
- `Task2` – Fail-fast validation and immutable records
- `Task3` – Structured tracing
- `com.uet.billing` – Billing service and JUnit 5 tests

## Author
Software Engineering Student

