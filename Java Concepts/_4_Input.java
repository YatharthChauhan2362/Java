// Taking input in Java
// This Program was Created By Yatharth Chauhan

import java.util.Scanner;

public class _4_Input {
    public static void main(String[] args) {

        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = sc.nextInt();

        System.out.println("Enter number 2");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of these numbers is");
        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.nextLine();
        System.out.println(str);

        sc.close();
    }
}