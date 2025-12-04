# GymAppSkeleton
Skeleton code for Gym Class &amp; Membership Management System

Team: Erijon Huruglica,Nart Sherifi,Ermal Huruglica

This project is a Gym Class and Membership Management System developed in JavaScript (Node.js).
The goal is to design and implement a small modular application that demonstrates the use of GRASP principles, SOLID principles, and Creational design patterns such as the Factory Method.

📌 Part 2 – Updated Implementation

The application has been expanded from Part 1 to include multiple software design patterns, refined UML, and improved architecture.

### ✔ Implemented Design Patterns

#### **1. Factory Method Pattern**
- Location: `com.gym.factory.MembershipFactory`
- Purpose: Creates membership objects (Basic, Premium) without exposing creation logic.
- Benefit: Allows easy addition of new membership types.

---

#### **2. Strategy Pattern (Payment Processing)**
- Interfaces located in: `com.gym.payment`
- Used by: `PaymentManager`
- Purpose: Swap different payment algorithms (default, online, discount, etc.).
- Benefit: Reduces coupling and makes payment behavior interchangeable.

---

#### **3. Observer Pattern (Class Notifications)**
- Observer: `MemberObserver`
- Subject: `GymClass`
- Purpose: Notify members when:
  - A class is created
  - A trainer is assigned
- Benefit: Decouples notification logic from class management.

---

#### **4. Builder Pattern (Trainer Creation)**
- Located in: `Trainer.Builder` inside `com.gym.models.Trainer`
- Purpose: Build `Trainer` objects flexibly.
- Benefit: Makes adding trainer attributes easier in the future.

---

#### **5. Decorator Pattern (Membership Add-ons)**
- Interface: `MembershipComponent`
- Concrete decorator: `PersonalTrainingDecorator`
- Purpose: Add extra services (e.g., personal training) to any membership.
- Benefit: Extends membership functionality without modifying existing classes.

