// Variable Arguments (VarArgs) in Java
// This Program was Created By Yatharth Chauhan

// Now, let's suppose you want to overload an "add" method. The "add" method
// will accept one argument for the first time and every time the number of
// arguments passed will be incremented by 1 till the number of arguments is
// equaled to 10.

// One approach to solve this problem is to overload the "add" method 10 times.
// But is it the optimal approach? What if I say that the number of arguments
// passed will be incremented by 1 till the number of arguments is equaled to
// 1000. Do you think that it is good practice to overload a method 1000 times?
// To solve this problem of method overloading, Variable Arguments(Varargs) were
// introduced with the release of JDK 5.

// With the help of Varargs, we do not need to overload the methods.

// Syntax :

// public static void foo(int … arr)
// {
// arr is available here as int[] arr
// }

// foo can be called with zero or more arguments like this:

// foo(7)
// foo(7,8,9)
// foo(1,2,7,8,9)

public class _22_Variable_Arguments {

    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(4, 5, 6));
    }
}
