# **Simple GUI in Java**

## **JavaFX vs Swing**
In Java, there are two widely recognized libraries for building Graphical User Interfaces (GUI): Swing and JavaFX

Swing is simple and great for basic GUI applications but has an older, less modern design. JavaFX, on the other hand, is more modern, supports advanced features like CSS styling, animations, and 3D graphics, making it ideal for sleek and dynamic applications.

### **Swing**
Swing, introduced in 1997, is one of the oldest GUI libraries in Java. 
Swing is considered outdated compare to JavaFX, but its great for beginners to understand GUI programming in Java.

### **JavaFX**
JavaFX is designed to help developers create sleek, dynamic, and visually appealing applications that meet contemporary standards. JavaFX is the modern successor to Swing, introduced in 2008.

## **JFrame**
JFrame is a class in the Swing library of Java. It is a top-level container used to create windows in GUI applications.

**Example**:  
```java
import javax.swing.*;

public class BNCCsesi5 {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("My First Swing Application");

        frame.setSize(400, 300);                                      // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         // Specify an action for the close button

        // Create a label and add it to the frame
        JLabel label = new JLabel("Hello, BNCC", SwingConstants.CENTER);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}

```
---

