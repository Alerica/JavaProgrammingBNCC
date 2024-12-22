**What is function**
A function (also called a method in Java) is a block of code that does something. You can use it to perform a specific task. Functions help you organize your code so you don’t have to repeat the same code over and over.


public int Add(int a, int b) {
    return a + b; // Adds two numbers and returns the result
}

public -> access modifier
int -> return variable 
Add -> name of the function

(int a, int b) is called Parameter, which take an input to be used in the function

**When Do We Use void?**
Use void when you don’t need the method to return a result. Instead, the method just does something.

public void Add(int a, int b) {
    System.out.println((a+b)); // Instead of returning the result, immediately print the result.
}

**What is the static Keyword?**
The static keyword means that something belongs to the class and not to an individual object.
In simple term, you don`t need to creat an object or instance to use the function. We will learn this on course 3

public class BNCCsesi1 {
    public static int Product(int a, int b) {
        return a * b;
    }
}

int result = BNCCsesi1(4, 5); // No object needed

without static keyword

BNCCSesi1 object1 = new BNCCSesi1();
int result = object1.Product(4, 5);

Recording Link : https://bit.ly/48vfCDL
