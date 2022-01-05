// Java Anonymous Classes & Lambda Expressions
// This Program was created by Yatharth Chauhan

// Anonymous class is nothing but a class without any name.
// They are used to override a class method or interface.
// Anonymous classes in Java help us to write more concise and readable code.

// Syntax :

/* Demo can be interface or abstract class. */

// Demo t = new Demol()
// {

/* data members and methods */

// public void Demo_method()
// {
// ........
// ........
// }
// };

// Ways to create an Anonymous Java class :

// The Anonymous class in Java can be created by two ways :
// 1, By extending a class
// 2. By implementing an interface

// Lambda Expressions :

// Lambda expressions were introduced in Java 8.
// They are similar to methods, but they don't need a name.

// Syntax :
// (parameter1, parameter2) -> { code to be executed }

@FunctionalInterface
interface DemoAno {
    void meth1(int a);
    // void meth2();
}

//
// class HarryFunc implements DemoAno{
// @Override
// public void meth1() {
// System.out.println("This is method 1");
// }
// }

// class AnonyDemo implements DemoAno{
// public void display(){
// System.out.println("Hello");
// }
//
// @Override
// public void meth1() {
// System.out.println("I am meth1");
// }
//
// @Override
// public void meth2() {
// System.out.println("I am meth2");
// }
// }

public class _71__lambda {
    public static void main(String[] args) {
        // DemoAno obj = new AnonyDemo();
        // obj.meth1();

        // Anonymous Class
        // DemoAno obj = new DemoAno() {
        // @Override
        // public void meth1() {
        // System.out.println("I am meth1");
        // }
        //
        // @Override
        // public void meth2() {
        // System.out.println("I am meth2");
        // }
        // };
        // obj.meth1();

        // Lambda Expressions

        // DemoAno obj = new HarryFunc();
        // obj.meth1();
        DemoAno obj = (a) -> {
            System.out.println("I am method 1 from this lambda " + a);
        };
        obj.meth1(6);
    }
}
