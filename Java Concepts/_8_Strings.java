// Introduction to Strings
// This Program was created by Yatharth Chauhan

/*
Different ways to print in Java :
We can use the following ways to print in Java:

System.out.print() // No newline at the end
System.out.println() // Prints a new line at the end
System.out.printf()
System.out.format()
System.out.printf("%c",ch)
  %d for int
  %f for float
  %c for char
  %s for string 
*/

import java.util.Scanner;

public class _8_Strings {
  public static void main(String[] args) {
    // String name = new String("Harry");
    // String name = "Harry";
    // System.out.print("The name is: ");
    // System.out.print(name);

    int a = 6;
    float b = 5.6454f;

    System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
    // System.out.format("The value of a is %d and value of b is %f", a, b);

    Scanner sc = new Scanner(System.in);

    // String st = sc.next();
    // String st = sc.nextLine();
    // System.out.println(st);

    sc.close();
  }
}