# My Maven Project

This project implements a simple Fibonacci function and includes unit tests to verify its correctness using JUnit.

## Project Structure

```
my-maven-project
├── src
│   ├── main
│   │   └── java
│   │       └── Main.java
│   └── test
│       └── java
│           └── MainTest.java
├── pom.xml
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Maven 3.6.0 or higher

## Building the Project

To build the project, navigate to the project directory and run:

```
mvn clean install
```

## Running the Application

To run the application, use the following command:

```
mvn exec:java -Dexec.mainClass="Main"
```

## Running Tests

To run the tests, execute:

```
mvn test
```

This will run all the unit tests defined in the `src/test/java/MainTest.java` file.
