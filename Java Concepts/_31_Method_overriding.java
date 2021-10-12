// Method Overriding in Java:
// This Program was Created By Yatharth Chauhan

// If the child class implements the same method present in the parent class
// again, it is know as method overriding.
// Method overriding helps us to classify a behavior that is specific to the
// child class.
// The subclass can override the method of the parent class only when the method
// is not declared as final.

class A {

    public int a;

    public int harry() {

        return 4;
    }

    public void meth2() {

        System.out.println("I am method 2 of class A");
    }
}

class B extends A {

    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

public class _31_Method_overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
