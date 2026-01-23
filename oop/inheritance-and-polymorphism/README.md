# Inheritance and Polymorphism in Java

This project demonstrates core **Object-Oriented Programming (OOP)** principles in Java,
with a focus on **class design, inheritance, abstraction, and polymorphism**.

The example was designed to evaluate the ability to learn and model a domain that may be
unfamiliar, reflecting real-world software development scenarios.

---

## OOP Concepts Demonstrated
- Abstract classes
- Inheritance
- Polymorphism
- Encapsulation
- Method overriding
- Implicit and explicit calls to `toString()`

---

## Design Overview
- A **superclass** defines common attributes and abstract behavior.
- Two **subclasses** inherit from the superclass and provide their own implementations
  of the abstract methods.
- Polymorphism is demonstrated by referencing subclass objects through a superclass type.
- Both implicit and explicit calls to `toString()` are used in the test program.

---

## Class Structure
- **SuperClass.java**
  - Contains shared variables, constructors, accessors, mutators
  - Declares abstract methods to be implemented by subclasses

- **SubClassOne.java**
  - Inherits from the superclass
  - Provides specific implementations of abstract methods

- **SubClassTwo.java**
  - Inherits from the superclass
  - Provides specific implementations of abstract methods

- **TestProgram.java**
  - Creates objects using superclass references
  - Demonstrates polymorphism and method overriding
  - Shows implicit and explicit calls to `toString()`

---

## Key Learning Outcomes
- Applying OOP principles to unfamiliar problem domains
- Designing flexible and reusable class hierarchies
- Understanding runtime method binding through polymorphism



javac *.java
java TestProgram
