# Report for SOLID Principles Implementation

<br><br>
<br><br>

## Contents

- [Objectives](#objectives)
- [Overview](#overview)
- [Implementation](#implementation)
    - [Single Responsibility Principle](#single)
    - [Open/Closed Principle](#openclosed-principle)
    - [Results](#results)
- [Conclusion](#conclusion)

## Objectives

1. **Implement 2 SOLID letters in a simple project.**


## Overview
The project implements two principles from SOLID in Java: SRP, which ensures that each class has a single responsibility, and OCP, which allows the system to be extended without modifying existing code. We use basic shape classes (Circle, Rectangle, Triangle) to demonstrate these principles.

My laboratory work was done in Java.




### Single

```java
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}
```
SRP is applied by creating separate classes (Circle, Rectangle) that handle 
the logic specific to their shapes. Each class has one responsibility: 
calculating the area.


### Open/Closed Principle

```java
        public interface Shape {
    double calculateArea();
}

public class Triangle implements Shape {
    private double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
```
The OCP is applied by using the Shape interface, allowing the system to be extended by
adding new shapes like Triangle without modifying the existing code for Circle and 
Rectangle.







### Results

```text
Circle area: 78.54
Rectangle area: 24.0
Triangle area: 7.5


```

### Conclusion

This simple Java project has provided a clear understanding of the Single Responsibility and Open/Closed principles. The SRP ensures that each class handles one task, while the OCP demonstrates how to extend functionality without altering existing code.