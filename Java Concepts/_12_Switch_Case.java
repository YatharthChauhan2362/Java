// Switch Case Statements in Java
// This Program was created by Yatharth Chauhan

/*
Switch Case-Control Instruction:

Switch-Case is used when we have to make a choice between the number of alternatives for a given variable.
Var can be an integer, character, or string in Java.

Every switch case must contain a default case. The default case is executed when all the other cases are false.
Never forget to include the break statement after every switch case otherwise the switch case will not terminate.

Syntax :
 Switch(var) {
	Case C1:
		//Code;	
		break;
	Case C2:
		//Code;
		break;	
	Case C3:
		//Code
		break;
	default:
		//Code
*/

import java.util.Scanner;

public class _12_Switch_Case {
    public static void main(String[] args) {
        String var = "Yatharth";

        switch (var) {
            case "Riya" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Yatharth" -> System.out.println("You are going to join a Job!");
            case "Dev" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }

        System.out.println("Thanks for using my Java Code!");

        int age;

        System.out.println("Enter Your Age");

        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are experienced!");

        } else if (age > 46) {
            System.out.println("You are semi-experienced!");

        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced!");

        } else {
            System.out.println("You are not experienced");

        }
        if (age > 2) {
            System.out.println("You are not a baby!");
        }
        sc.close();
    }
}
