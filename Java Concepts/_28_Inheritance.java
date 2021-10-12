// Inheritance in Java
// This Program was Created By Yatharth Chauhan

// You might have heard people saying your nose is similar to your father or
// mother. Or, more formally, we can say that you've inherited the genes from
// your parents due to which you look similar to them.

// The same phenomenon of inheritance is also valid in programming.

// In Java, one class can easily inherit the attributes and methods from some
// other class. This mechanism of acquiring objects and properties from some
// other class is known as inheritance in Java.

// Inheritance is used to borrow properties & methods from an existing class.
// Inheritance helps us create classes based on existing classes, which
// increases the code's reusability.

// Important terminologies used in Inheritance :

// Parent class/superclass: The class from which a class inherits methods and
// attributes is known as parent class.
// Child class/sub-class: The class that inherits some other class's methods and
// attributes is known as child class.

// Extends keyword in inheritance :

// The extends keyword is used to inherit a subclass from a superclass.

// Syntax :
// class Subclass-name extends Superclass-name
// {
// methods and fields
// }

// Create a class Animal and Derive another class dog from it.

class Base {

    public int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {

        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe() {

        System.out.println("I am a constructor");
    }
}

class Derived extends Base {

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class _28_Inheritance {
    public static void main(String[] args) {

        // Creating an Object of base class

        Base b = new Base();
        b.setX(4);

        System.out.println(b.getX());

        // Creating an object of derived class

        Derived d = new Derived();
        d.setY(43);

        System.out.println(d.getY());
    }
}
