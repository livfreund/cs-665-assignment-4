
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Olivia Freund              |
| Date         | 11/07/2026                 |
| Course       | Fall                       |
| Assignment # | 4                          |

# Assignment Overview
This project demonstrates the use of the Adapter Design Pattern to integrate a modern customer system with a legacy customer system that uses a different interface. The modern system accesses customer data through a customer API, while the legacy system retrieves customer information from a USB-based storage system. Because the interfaces are incompatible, an adapter is used to translate requests between the two systems. The solution includes customer data classes, modern and legacy system implementations, an adapter class, and JUnit tests. The adapter allows the client to access customer data without needing to know whether the data comes from the modern or legacy system.

# GitHub Repository Link:
https://github.com/livfreund/cs-665-assignment-4

# Implementation Description 
For each assignment, please answer the following:

### - Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.
This implementation is flexible because clients communicate through the CustomerDataApi interface rather than directly with specific classes. New customer systems can be added by implementing the same interface, and existing systems can be removed without affecting client code. This makes the application easier to extend and maintain over time.

### - Discuss the simplicity and understandability of your implementation, ensuring that it is easy for others to read and maintain.
The design is simple because each class has a single responsibility. The customer class stores data, the system classes retrieve data, and the adapter handles interface conversion. Clear class names and a straightforward structure make the code easy to read, understand, and maintain.

### - Describe how you have avoided duplicated code and why it is important.
Duplicated code was avoided by reusing the functionality already provided by the legacy system. The adapter forwards requests to the legacy system instead of creating separate retrieval logic. Reducing duplication improves maintainability, minimizes errors, and makes future updates easier.

### - If applicable, mention any design patterns you have used and explain why they were chosen.
This implementation uses the Object Adapter Design Pattern. The Adapter pattern was chosen because the assignment requires two systems with incompatible interfaces to work together. The adapter translates requests from the modern interface into requests that the legacy system can understand, allowing both systems to be used without modifying their existing code.

# UML Diagram 
The UML Diagram for this application is provided the zip file as an image. I used LucidChart to create the UML Diagram for this project. 

# CS-665 Java Project Template

This repository is a Java 25 Maven project template for CS-665 coursework. It provides a working build setup, example Java code, and test infrastructure for student assignments and small Java applications.

## Project overview

The project is organized around a simple educational example:

- `src/main/java/edu/bu/met/cs665/Main.java` runs a basic Log4j 2 example.
- `src/main/java/edu/bu/met/cs665/example1/Person.java` defines a `Person` model with names and age calculation.
- `src/test/java/edu/bu/met/cs665/TestAge.java` contains JUnit tests covering name accessors and birthday logic.

This template is designed to be easy to extend for assignments involving object modeling, unit testing, and software design patterns.

## Features included

- Java 25 Maven configuration with `maven.compiler.release` set to `25`
- Log4j 2 logging configuration in `src/main/resources/log4j2.xml`
- JUnit testing support
- JaCoCo coverage reports
- SpotBugs static analysis
- Checkstyle configuration under `config/`

## Prerequisites

Before building, install:

- Java 25 JDK
- Apache Maven 3.9 or newer

Check your environment with:

```bash
java -version
mvn -version
```

If Maven reports an older Java version, update `JAVA_HOME` and `PATH` so Maven uses JDK 25. For example on macOS:

```bash
export JAVA_HOME="$(/usr/libexec/java_home -v 25)"
export PATH="$JAVA_HOME/bin:$PATH"
mvn -version
```

## Build and run

Compile the project:

```bash
mvn clean compile
```

Run the unit tests:

```bash
mvn clean test
```

Generate coverage and build reports:

```bash
mvn clean verify
```

Run the sample application:

```bash
mvn exec:java
```

Launch the SpotBugs GUI:

```bash
mvn spotbugs:gui
```

Generate the Checkstyle report:

```bash
mvn checkstyle:checkstyle
```

## Useful reports

After running verification, inspect the generated reports in the `target/` directory:

- JaCoCo: `target/site/jacoco/index.html`
- Checkstyle HTML: `target/site/checkstyle.html`

## Notes

This project is a template, so it is meant to be adapted for a specific assignment or project. You can change the example classes, add new domain objects, and expand the tests as needed while keeping the Maven and Java configuration intact.
