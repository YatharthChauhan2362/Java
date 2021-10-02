// Recursion in Java
// This Program was Created By Yatharth Chauhan

// One does not simply understand RECURSION without understanding RECURSION.

// In programming, recursion is a technique through which a function calls
// itself.
// With the help of recursion, we can break down complex problems into simple
// problems.
// Example: Factorial of a number
// factorial(n) = n*factorial(n-1) [n >= 1]
// Now, let's see an example to see the beauty of recursion in programming.
// First, we will print numbers from 1 to n and then n to 1 using recursion.

// Program for printing 1 to n :

// class _23_Recursion {
// static void fun1(int n) {
// if (n > 0) {
// System.out.println(n);
// fun1(n - 1);
// }
// }

// public static void main(String[] args) {
// int n = 3;
// fun1(n);
// }
// }

// Program for printing n to 1 :

class _23_Recursion {
    static void fun1(int n) {
        if (n > 0) {
            System.out.println(n);
            fun1(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        fun1(n);
    }
}