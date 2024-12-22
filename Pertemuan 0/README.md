# Java Programming Basics
This course is a guide to Java programming basics.

---

## **1. Print**
In Java, you can print to the console using the `System.out.println` or `System.out.print` methods.

### **Example:**
```java
public class PrintExample {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Prints with a new line
        System.out.print("This is Java."); // Prints without a new line
    }
}
```

---

## **2. Variable**
Variables are used to store data in Java. Each variable has a type that defines what kind of data it can store.

### **Example:**
```java
public class VariableExample {
    public static void main(String[] args) {
        int age = 25; // Integer variable
        String name = "Alice"; // String variable
        double height = 5.6; // Double variable

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
```

---

## **3. Comment**
Comments in Java help document the code and are ignored during execution. There are single-line and multi-line comments.

### **Example:**
```java
public class CommentExample {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Single-line comment example.");

        /*
         * This is a
         * multi-line comment
         */
        System.out.println("Multi-line comment example.");
    }
}
```

---

## **4. Arithmetic**
Arithmetic operations include addition, subtraction, multiplication, division, and modulus.

### **Example:**
```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
```

---

## **5. Bitwise**
Bitwise operations work on binary representations of numbers.

### **Example:**
```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        System.out.println("AND: " + (a & b)); // 0101 & 0011 = 0001
        System.out.println("OR: " + (a | b));  // 0101 | 0011 = 0111
        System.out.println("XOR: " + (a ^ b)); // 0101 ^ 0011 = 0110
        System.out.println("NOT: " + (~a));    // ~0101 = 1010 (in 2's complement)
    }
}
```

---

## **6. Math Function**
Java provides the `Math` class for mathematical operations.

### **Example:**
```java
public class MathFunctionExample {
    public static void main(String[] args) {
        System.out.println("Square root: " + Math.sqrt(16));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Absolute value: " + Math.abs(-10));
        System.out.println("Random number: " + Math.random());
    }
}
```

---

## **7. Conditional (IF, Switch)**
Conditionals allow you to make decisions in your program.

### **Example:**
#### **IF Statement:**
```java
public class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }
    }
}
```

#### **Switch Statement:**
```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
```

---

## **8. Repetition**
Loops allow you to repeat code.

### **Example:**
#### **For Loop:**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
```

#### **While Loop:**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
}
```

---

## **9. Primitive vs Abstract (Wrapper)**
Primitive types are basic data types, while wrapper classes are their object equivalents.

### **Example:**
```java
public class WrapperExample {
    public static void main(String[] args) {
        int primitive = 5; // Primitive
        Integer wrapper = Integer.valueOf(primitive); // Wrapper

        System.out.println("Primitive: " + primitive);
        System.out.println("Wrapper: " + wrapper);
    }
}
```

---

## **10. Arrays**
Arrays store multiple values of the same type.

### **Example:**
```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
