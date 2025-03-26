# JDBC Inventory Management

## Description
This project is a simple Inventory Management System implemented using Java and JDBC. It allows users to perform CRUD (Create, Read, Update, Delete) operations on inventory items in a database.

## Features
- Add new inventory items
- View all inventory items
- Update existing inventory items
- Delete inventory items
- Search for inventory items by name

## Prerequisites
Before you begin, ensure you have the following installed on your machine:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) (version 8 or above)
- [Apache Maven](https://maven.apache.org/download.cgi)
- A database (e.g., MySQL, PostgreSQL)

## Installation and Setup

1. Clone the repository
    Open your terminal and run:
    ```
    sh
    git clone https://github.com/ragavithangaraj/JDBC-inventory-management.git
    ```

2. Navigate to the project directory
    Change to the project directory:
    ```
    sh
    cd JDBC-inventory-management
    ```

3. Configure the database
    - Create a database named `inventory_db`.
    - Update the `src/main/resources/db.properties` file with your database connection details:
      ```properties
      db.url=jdbc:mysql://localhost:3306/inventory_db
      db.username=your_username
      db.password=your_password
      ```

4. Build the project
    Compile the project using Maven:
    ```sh
    mvn clean install
    ```

5. Run the project
    Execute the main class
    

```
JDBC-inventory-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── Main.java
│   │   │           ├── InventoryItem.java
│   │   │           ├── InventoryDAO.java
│   │   │           └── DatabaseConnection.java
│   │   └── resources/
│   │       └── db.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── InventoryDAOTest.java
├── pom.xml
└── README.md
```

Acknowledgments
- Developed using Java and JDBC.
- Inspired by the need for simple inventory management solutions.



