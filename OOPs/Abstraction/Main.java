
// Abstraction : hiding the implementation details and highlighting the essential features or services which we want to provide to the user

// eg: ATM machine, we don't know how it works internally but we know what services it provides to us.
// we can achieve abstraction by using abstract classes and interfaces in Java.

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape{
    void draw() {
        System.out.println("Drawing Circle");
    }
}

interface Drawable {
    void draw(); // abstract method
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(); // upcasting
        shape.draw(); // calling the draw method of Circle class

        Drawable drawable = new Rectangle(); // upcasting
        drawable.draw(); // calling the draw method of Rectangle class

        Rectangle rectangle = new Rectangle(); // creating object of Rectangle class
        rectangle.draw(); // calling the draw method of Rectangle class
    }
}   