// Annotations in Java
// This Program was created by Yatharth Chauhan

// -> Annotations provides metadata to class/methods.
// -> Annotations start with '@'.
// -> Annotations are helpful for detecting erros. Example : @override
// annotations
// will make sure that there are no typos while overriding a method.

// Important Annotations In Java :

// 1. @Override:

// -> This annotation makes sure that the sub class method is successfully
// overiding the parent class method.
// -> While overriding a class, there is a chance of typing errors or spelling
// mistakes. In such cases, the method will not get overridden and you will get
// an error.
// -> Override exception helps us to encounter such situtations by extracting a
// warning from the compiler.

// 2. @Deprecated :
// -> This annotation is used to mark a deprecated method.
// -> If developer uses the deprecated method then the compiler generated a
// warning.
// -> There high chance of removal of deprecated methods in future versions
// therefore it is better to not use them.

// 3. @SupressWarnings :
// -> This annotation helps us to supress some warnings that are being generated
// by compiler.

// 4. @FunctionInterface :
// -> An interface which contains only one abstract method is known as functional interface.
// @FunctionInterface annotation helps us to make sure that a functional interface is not having more than one abstract method.

@FunctionalInterface
interface myFunctionalInteface {
    void thisMethod();
    // void thisMethod2();
}

class NewPhone extends Phone {
    @Override
    public void showTime() {
        System.out.println("Time is 8 PM");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class _70_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}
