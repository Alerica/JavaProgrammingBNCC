# **Java Programming As Object-Oriented Programming**

## **1.Difference between Class vs Object**

- **Class**: 
  - A blueprint or template that defines the structure and behavior of objects.
  - It contains attributes (fields) and methods (functions) to represent and manipulate data.
  - Example:
    ```java
    public class Car {
        String brand;
        int year;
        
        void displayInfo() {
            System.out.println("Brand: " + brand + ", Year: " + year);
        }
    }
    ```

- **Object**: 
  - An instance of a class.
  - It is created from the class and holds the actual data.
  - Example:
    ```java
    Car myCar = new Car(); // Creating an object of the Car class
    myCar.brand = "Toyota";
    myCar.year = 2020;
    myCar.displayInfo(); // Calls the displayInfo method
    ```

---

## **2.Introduction to Object-Oriented Programming (OOP)**

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects." In OOP, the focus is on creating reusable and modular code by organizing data and behavior into objects. Java is a popular language that implements OOP principles to develop scalable and maintainable applications.

### Key OOP Principles:
1. **Classes and Objects**  
   A **Class** is a blueprint for creating objects. It defines the properties and behaviors that the objects created from it will have. An **Object** is an instance of a class, which contains both data (attributes) and methods (functions).

2. **Encapsulation**  
   Encapsulation is the concept of bundling the data (attributes) and methods (functions) that operate on the data into a single unit called a class. Access to the data is controlled by access modifiers (like `private`, `protected`, `public`), ensuring that the internal state of the object is hidden and can only be modified through controlled methods.

3. **Inheritance**  
   Inheritance allows a class (known as a **subclass** or **derived class**) to inherit the properties and behaviors of another class (known as a **superclass** or **base class**). This promotes code reuse and establishes a hierarchy between classes.

4. **Polymorphism**  
   Polymorphism allows objects to take on multiple forms. It occurs when a method in a subclass has the same name as a method in its superclass but provides a different implementation. There are two types:

5. **Abstraction**  
   Abstraction is the process of hiding complex implementation details and exposing only the necessary features of an object. It helps reduce complexity and allows users to interact with objects without needing to know how they work internally.
   
### **Inheritance**

Inheritance is a mechanism that allows one class (subclass) to inherit the properties and methods of another class (superclass).

**Example**:  
```java
class Superclass {
    // Properties and methods of the superclass
}

class Subclass extends Superclass {
    // Additional properties and methods specific to the subclass
}
 - **Runtime Polymorphism**: Achieved using method overriding.
```
---
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```
---

### **Encapsulation**

Encapsulation is the practice of keeping the data (fields) of a class private and providing controlled access through public methods (getters and setters).

Benefits:
Hides the internal state of the object.
Protects the integrity of the data.
Reduces dependencies on the internal implementation.

**Example**: 
```java
public class BankAccount {
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }
    
    // Method to display account details
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
```
### **Polymorphism**

Polymorphism allows objects to be treated as instances of their superclass, even if they are instances of subclasses. There are two types of polymorphism: compile-time and runtime.

#### Compile-time Polymorphism (Method Overloading)
A class can have multiple methods with the same name but different parameters.

```java
class BNCCsesi4 {
    int Add(int a, int b) {
        return a + b;
    }
    
    double Add(double a, double b) {
        return a + b;
    }
}
```

#### Runtime Polymorphism (Method Overriding)
Occurs when a subclass provides its specific implementation of a method.
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

### **Abstraction**  
   Abstraction is the process of hiding complex implementation details and exposing only the necessary features of an object. It helps reduce complexity and allows users to interact with objects without needing to know how they work internally.
   
#### **Why Abstraction?**  
   - It allows focusing on essential qualities and ignoring irrelevant details.
   - Reduces the effort required to understand and use complex systems.
   
**Abstract Classes**: An abstract class cannot be instantiated and may contain abstract methods (without implementation) that must be implemented by its subclasses.
   
**Interfaces**: A way to define a contract that a class must adhere to by implementing its methods, but without providing the actual implementation.
   
**Example of Abstraction**:
 ```java
 abstract class Shape {
     abstract void draw(); // Abstract method
 }
 
 class Circle extends Shape {
     void draw() {
         System.out.println("Drawing a Circle");
     }
 }
 
 class Rectangle extends Shape {
     void draw() {
         System.out.println("Drawing a Rectangle");
     }
 }
 
 public class TestAbstraction {
     public static void main(String[] args) {
         Shape shape1 = new Circle();
         Shape shape2 = new Rectangle();
         
         shape1.draw(); // Outputs: Drawing a Circle
         shape2.draw(); // Outputs: Drawing a Rectangle
     }
 }
 ```

---
