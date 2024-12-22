# Java Programming Introduction Into OOP

## Introduction to OOP
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects, which contain both data and methods that operate on that data. In OOP, the main principles include encapsulation, inheritance, polymorphism, and abstraction.

## What is OOP?
OOP is a programming model that organizes software design around data, called "objects." These objects are instances of classes that encapsulate both data (fields) and behavior (methods). 

## What is a Package?
In Java, a package is a namespace that organizes classes and interfaces into hierarchical structures. Packages help avoid naming conflicts and allow for code reuse. A package can contain multiple classes and interfaces.

### Creating a Package:
```java
package bnccsesi3;  // Declaring a package
```

## What is a Class?
A class is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that the objects created from it will have.

### Example of a Class:
```java
public class Car {
    // Properties (fields)
    private String brand;
    private int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
```

### How to Create a New Class
To create a new class, use the class keyword followed by the class name. The class can contain fields and methods.

**Example:**
```java
public class Person {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

### How to Create an Instance/Object
To create an instance of a class, use the new keyword followed by the class name and provide necessary parameters if any.

**Example:**
```java
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Person class
        Person person = new Person("John Doe", 25);

        // Calling method on the instance
        person.showDetails();

        // Creating an instance of Car class
        Car car = new Car("Toyota", 2022);
        car.displayInfo();
    }
}
```
