
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.marriage(); // Output: Parent class method marriage, parent choose the partner whose name is X
        parent = new Child();
        parent.marriage(); // Output: Child class method marriage, child choose the partner whose name is Y
        Child child = new Child();
        child.marriage(); // Output: Child class method marriage, child choose the partner whose name is Y

    }
}


class Parent{
    
    void marriage(){
        System.out.println("Parent class method marriage, parent choose the partner whose name is X");
    }
}

class Child extends Parent{
    
    void marriage(){
        System.out.println("Child class method marriage, child choose the partner whose name is Y");
    }
}


// Overriding is a feature in java that parent class method is availabe in child class with same name and same parameters. 
// It is related to run time polymorphosim. In method overriding, the method name is same and the parameters are also same. 
// The return type of the method can be same or different. Overriding is used to provide specific implementation of a method 
// that is already provided by its parent class. It is also used to achieve runtime polymorphosim.
