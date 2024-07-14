# SOLID With Design Pattern

The SOLID principles are a set of five design principles that help developers create more maintainable, flexible, and scalable object-oriented software. Each principle focuses on a specific aspect of software design, promoting code readability, reusability, and maintainability


## Problem scenario:

____________________________________________________________________

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.


## Implementation of SOLID With Design Pattern

<p align="center">
    <img src="image.png" alt="Centered Image" /><br>
</p>

## Unified Modeling Language (UML) Class Diagram

<p align="center">
  <img src="https://github.com/SG-Hangaan/SOLID-WithDesignPattern/assets/127215110/022bdc26-ba4d-42d9-ac5f-a1810a80b314"/>
</p>

