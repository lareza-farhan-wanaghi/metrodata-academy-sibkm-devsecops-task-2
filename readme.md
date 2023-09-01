# Metrodata Academy SIBKM DevSecOps Task 2: Developing A Program with Java

## Objectives

Develop a simple program that demonstrates the implementation of fundamental programming concepts and Object-Oriented Programming (OOP) principles. The program will cover the following topics:
1. Data Types
2. Variables
3. Operators
4. Decision-making
5. Loops
6. Methods
7. Classes & Objects
8. Inheritance
9. Polymorphism
10. Encapsulation
11. Abstraction

## Resolution

### 1. The Program
The developed program is a command-line application that calculates the area and perimeter of a square. The program's flow is outlined below:
1. The user inputs a numeric value that represents the side length of a square.
2. If the input value is greater than 0, the program calculates and prints the square's area and perimeter using the input as the side length. If the input value is 0 or less, the program terminates.
3. The program returns to step 1 for further calculations.

    <img src="_resources/Screenshot%202023-08-30%20at%2011.45.25.png" width="75%"/>

You can find the code of the program in the Main.java file.

### 2. Code Examples Covering the Topics

#### 1. Data Types
In the code, a double data type is utilized to represent the side length of the square:
```java
protected double side;
```

#### 2. Variables
A variable named "side" with a data type of double is declared to store the side length:
```java
protected double side;
```

#### 3. Operators
Assignment and arithmetic operators are employed within the code. An example of the assignment operator is used to assign a value to the "side" instance variable:
```java
this.side = side;
```
An arithmetic operator is also used to calculate the square's area:
```java
return side * side;
```

#### 4. Decision-making
The program uses an if statement to determine whether to proceed or exit. For instance, lines 41-43 contain the following logic:
```java
if (sideLength <= 0) {
    break; // Exit loop if non-positive input is given
}
```

#### 5. Loops
A while loop (lines 37-49) is utilized to continuously execute the program until the user inputs a value of 0 or less:
```java
while (true) {
    System.out.print("Enter the side length of the square (use 0 or less to exit): ");
    double sideLength = scanner.nextDouble();

    if (sideLength <= 0) {
        break; // Exit loop if non-positive input is given
    }

    Square square = new Square(sideLength);

    System.out.println("Square Area: " + square.getArea());
    System.out.println("Square Perimeter: " + square.getPerimeter());
}
```

#### 6. Methods
Abstract methods are defined within the abstract class "Shape" (lines 8-9):
```java
public abstract double getArea();
public abstract double getPerimeter();
```

#### 7. Classes & Objects
A class named "Square" is declared in lines 13-29. It represents a square shape and extends the "Shape" abstract class:
```java
class Square extends Shape {
    // Class implementation...
}
```
An object of the "Square" class is created in line 45:
```java
Square square = new Square(sideLength);
```

#### 8. Inheritance
In line 13, the class "Square" inherits from the "Shape" abstract class:
```java
class Square extends Shape {
    // Class implementation...
}
```

#### 9. Polymorphism
Polymorphism is demonstrated through method overriding. The `getArea` and `getPerimeter` methods are overridden in the "Square" class (lines 19-22 and 25-28, respectively):
```java
@Override
public double getArea() {
    return side * side;
}
```

```java
@Override
public double getPerimeter() {
    return 4 * side;
}
```

#### 10. Encapsulation
Encapsulation is exhibited in line 5, where the "side" variable is declared as protected, controlling access to it:
```java
protected double side;
```

#### 11. Abstraction
The "Shape" abstract class (lines 4-10) serves as a blueprint for shapes like the square, defining abstract methods for calculating area and perimeter:
```java
abstract class Shape {
    protected double side;

    public abstract double getArea();
    public abstract double getPerimeter();
}
```