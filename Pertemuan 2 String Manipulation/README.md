# Java Programming String Manipulation
This is a guide to Java programming string manipulation.

## **1. String Manipulation**
Strings in Java are objects that represent sequences of characters. You can manipulate strings using various methods provided by the `String` class.

### **Example:**
#### **Basic Operations:**
```java
public class StringManipulationExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Splitting
        String[] parts = result.split(" ");
        System.out.println("First Part: " + parts[0]);
        System.out.println("Second Part: " + parts[1]);

        // Substring
        String sub = result.substring(0, 5);
        System.out.println("Substring: " + sub);
    }
}
```

#### **Built-in Methods:**
```java
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Java Programming";

        // Length
        System.out.println("Length: " + str.length());

        // Equals
        System.out.println("Equals 'Java Programming': " + str.equals("Java Programming"));

        // Ignore Case
        System.out.println("Equals Ignore Case 'java programming': " + str.equalsIgnoreCase("java programming"));

        // Replace
        System.out.println("Replace 'Programming' with 'Language': " + str.replace("Programming", "Language"));

        // Character at Index
        System.out.println("Character at Index 5: " + str.charAt(5));
    }
}
```
