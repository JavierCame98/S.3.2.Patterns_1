# S.3.2.Patterns_1

This repository demonstrates the implementation of three fundamental Gang of Four (GoF) design patterns: Singleton, Abstract Factory, and Strategy. The project is designed to showcase clean code principles, decoupling, and runtime flexibility.

## Design Patterns Implemented

1. Singleton Pattern (Undo Class)
Purpose: Ensures a class has only one instance and provides a global point of access to it.
Scenario: An Undo system that stores a command history (using Stack or List) shared across the entire application.
Key Features: Private constructor, static getInstance() method, and history management (addCommand, undoCommand, showHistory).

2. Abstract Factory Pattern (International Contacts)
Purpose: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
Scenario: A contact manager that formats addresses and phone numbers differently based on the country (Spain vs. USA).
Key Features: ContactFactory interface, concrete factories for each country, and polymorphic Address and Phone products.

3. Strategy Pattern (Report Generation)
Purpose: Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.
Scenario: A reporting engine capable of generating documents in multiple formats (CSV, JSON, PDF, HTML, XML, Word, Excel).
Key Features: ReportStrategy interface and a context service that executes the selected strategy, following the Open/Closed Principle.

## Features & Technical Decisions
Decoupling: Used Abstract Factory to ensure the client code doesn't depend on country-specific formatting logic.
Flexibility: Implemented Strategy to allow adding new report formats without modifying the core service logic.
State Consistency: The Singleton pattern guarantees that the Undo history remains synchronized throughout the execution.
Unit Testing: All patterns are validated using JUnit 5 to ensure expected behavior and edge-case handling.

## Technologies
Language: Java 17+
Testing: JUnit 5
Concepts: Composition over Inheritance, Interface-based design, Dependency Inversion.

## Installation & Execution
Clone the repository
Import: Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code).
Run Tests: Execute the test suite to see the patterns in action:
Main Execution: Run the Main.java file to see a live demonstration of the Undo history and the Abstract Factory output.
