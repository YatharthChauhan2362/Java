// The do-while loop in Java
// This Program was created by Yatharth Chauhan

// Do-while loop:
// Do- while loop is similar to a while loop except for the fact that it is
// guaranteed to execute at least once.
// Use a do-while loop when the exact number of iterations is unknown, but you
// need to execute a code block at least once.
// After executing a part of a program for once, the rest of the code gets
// executed on the basis of a given boolean condition.

// Syntax :
/*
 * do {
 * 
 * /code
 * 
 * } while (condition); //Note this semicolon
 */

// Example :
// int i=1;
// do{
// System.out.println(i);
// i++;
// }while(i<=10);

// Difference Between while loop and do-while loop :

// while – checks the condition & executes the code.
// do-while – executes the code at least once and then checks the condition.

// Because of this reason, the code in the do-while loop executes at least once,
// even if the condition fails.

public class _14_do_while_loop {
    public static void main(String[] args) {

        int a = 0;

        while (a < 5) {
            System.out.println(a);
            a++;
        }
        System.out.println();

        int b = 10;

        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        System.out.println();

        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 45);
    }
}
