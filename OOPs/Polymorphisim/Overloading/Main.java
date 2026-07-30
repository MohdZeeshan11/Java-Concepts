// package OOPs.Polymorphisim.Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        double sum2 = calculator.add(3.5, 2.5);
        System.out.println("Sum of two doubles: " + sum2);

        int sum3 = calculator.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sum3);


        Parent parent = new Parent();
        parent.show(); // Output: Parent class method
        parent = new Child();
        parent.show(); // Output: Child class method
        Child child = new Child();
        child.show(); // Output: Child class method

    }
}


class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

// Overloading is a feature in java that allows a class to have same method name with different parameters.
// It is related to compile time polymorphosim. In method overloading, the method name is same but the parameters are different. 
// The parameters can be different in number, type or both. The return type of the method can be same or different.
// Overloading is used to increase the readability of the program. It is also used to perform different tasks with the same method name.


class Parent{
    
    void show(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
    
    void show(){
        System.out.println("Child class method");
    }
}