// This Program was Created By Yatharth Chauhan

// Question 1: Write a program to print the following pattern :
// ****
// ***
// **
// *

// Question 2: Write a program to sum first n even numbers using a while loop.

// Question 3: Write a program to print the multiplication table of a given
// number n.

// Question 4: Write a program to print a multiplication table of 10 in reverse
// order.

// Question 5: Write a program to find the factorial of a given number using for
// loops.

// Question 6: Repeat problem 5 using a while loop.

// Question 7: Repeat problem 1 using for/while loop.

// Question 8: What can be done using one type of loop can also be done using
// the other two types of loops - True or False.

// Question 9: Write a program to calculate the sum of the numbers occurring in
// the multiplication table of 8.

// Question 10 :A do-while loop is executed:
// At least once
// At least twice
// At most once

// Question 11: Repeat problem 2 using for loop.

public class Exercise_4 {
    public static void main(String[] args) {

        // Practice Problem 1
        System.out.println("Ans1");

        int n = 4;
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Practice Problem 2

        int sum = 0;
        int m = 4;

        for (int i = 0; i < m; i++) {

            sum = sum + (2 * i);
        }
        System.out.println("\nAns2");
        System.out.print("\nSum of even numbers is: ");
        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        // Practice Problem 3
        System.out.println("\nAns3");

        int p = 5;

        // for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d X %d = %d\n", p, i, p * i);
        }

        // Practice Problem 4
        System.out.println("\nAns5-6-7-8-9-10");

        int q = 10;

        // for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for (int i = 10; i >= 1; i--) {

            System.out.printf("%d X %d = %d\n", q, i, q * i);

            // Practice Problem 6
            int r = 5;
            // What is factorial n = n * n-1 * n-2 ..... 1
            // 5! = 5*4*3*2*1 = 120
            int x = 1;
            int factorial = 1;

            while (x <= r) {
                factorial *= x;
                x++;
            }
            System.out.println(factorial);

            // Practice Problem 9
            int s = 8;
            int sum_ = 0;
            // for(int i=0; i<10; i++) - Goes from i=0 to i=9

            for (int y = 1; y <= 10; y++) {
                sum_ += s * i;
            }

            System.out.println(sum_);

        }
    }
}