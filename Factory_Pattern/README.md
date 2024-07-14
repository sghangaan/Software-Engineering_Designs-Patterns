# Factory Pattern 

A creational design pattern used in software engineering that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling by eliminating the need to bind application-specific classes into the code. The creation of an object is delegated to a factory class, which abstracts the instantiation process.


## Problem 
Implement factory design pattern using Pet as the factory interface.  The interface implements two methods: makeSound() and play().

- Dog and Cat are concrete objects that implements Pet interface. <br>
- PetRecord holds attributes such as petId, petName, and Pet.  <br>
- Clinic would be the client object.  <br>
- Refer to the UML Class Diagram  <br>

## Implementation of Factory Pattern

<p align="center">
    <img src="image.png" alt="Centered Image" />
</p>


## Unified Modeling Language (UML) Class Diagram
![image](https://github.com/JerryEsperanza/factoryPattern/assets/142370600/0506f134-a5f6-4d98-a817-cd6f7a8466c7)
