# Family Cash Card

A modern way for parents to manage allowance funds for their kids, replacing physical cash with virtual "cash cards". The Family Cash Card app allows parents to easily send, receive, and track allowances, making it simpler to manage and control family funds.

## Features

- **Create, Edit, Delete Cash Cards**: Parents can create and manage multiple virtual cash cards for their children.
- **Transaction History**: Track the history of deposits and withdrawals for each cash card.
- **Role-Based Access**: Parents and children have different permissions, providing security and control over funds.
- **Mock Payment API (In Progress)**: Simulated transactions between parent and child accounts for educational purposes.
- **Cloud Deployment**: The project will be deployed to a cloud platform, ensuring scalability and accessibility.
- **UPI Integration (Planned)**: Future plans include exploring UPI payment integration for real-world transactions.

## Technologies Used

- **Java & Spring Boot**: Backend development framework.
- **MySQL**: Database for storing cash cards and transactions.
- **Spring Data JPA**: ORM for database interactions.
- **Gradle**: Build automation tool.
- **Spring Security**: Role-based access control (planned for implementation).
- **Test-Driven Development**: Implementing unit tests for cash card creation and management.
- **Cloud Integration (Planned)**: The app will be deployed on a cloud service like Heroku or AWS.

## Current Progress

- Set up **Spring Boot** environment and configured Gradle for build automation.
- Implemented **unit-level testing** for JSON serialization and deserialization.
- Created **CashCard database** in MySQL and connected it with the Spring application using **ORM (Object-Relational Mapping)**.
- Developed **GET API** for retrieving cash card details by ID.
- Ongoing work on implementing features like **mock transactions** and **role-based access**.

## Upcoming Features

- **Database Integration for Transactions**: Full support for deposit and withdrawal operations.
- **UPI Intent Flow (Android)**: Simulating UPI payments for demo purposes.
- **Admin Panel for Parents**: Manage multiple child accounts and cash cards.
- **Cloud Deployment**: Deploy the app on a cloud platform for global access.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/samarth-jain28/Family-Cash-Card.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Family-Cash-Card
    ```
3. Build and run the application using Gradle:
    ```bash
    ./gradlew bootRun
    ```
4. The app will be accessible at `http://localhost:8080`.

## Contributions

Feel free to fork the repository, create new branches, and submit pull requests!

---

Stay tuned for more updates on the Family Cash Card project.

