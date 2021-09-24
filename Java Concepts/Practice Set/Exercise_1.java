// This Program was Created By Yatharth Chauhan

// 1. Write a program to sum three numbers in Java.
// 2. Write a program to calculate CGPA using marks of three subjects (out of 100)
// 3. Write a Java program that asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.
// 4. Write a Java program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        // Question1
        int a = 4;
        int b = 17;
        int c = 6;
        int sum = a + b + c;
        System.out.println("Ans1");
        System.out.println(sum);

        // Question2
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println("\nAns2");
        System.out.println(cgpa);

        // Question 3
        System.out.println("\nAns3");
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
        sc.close();

        // Question 4
        System.out.println("\nAns4");
        System.out.println("Enter your number");
        Scanner sc_ = new Scanner(System.in);
        System.out.println(sc_.hasNextInt());
        sc_.close();
    }

}
