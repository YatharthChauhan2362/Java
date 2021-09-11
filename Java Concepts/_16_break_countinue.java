// break and continue in Java
// This Program was Created By Yatharth Chauhan

// Break statement :
// The break statement is used to exit the loop irrespective of whether the condition is true or false.
// Whenever a ‘break’ is encountered inside the loop, the control is sent outside the loop.

// Syntax : 
// break;

// Continue statement : 
// The continue statement is used to immediately move to the next iteration of the loop.
// The control is taken to the next iteration thus skipping everything below ‘continue’ inside the loop for that iteration.

// Syntax :
// continue;

public class _16_break_countinue {
    public static void main(String[] args) {

        // Break and continue using loops!
        // for (int i = 0; i < 50; i++) {
        // System.out.println(i);
        // System.out.println("Java is great");
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // }

        // int i = 0;
        // do {
        // System.out.println(i);
        // System.out.println("Java is great");
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // i++;
        // } while (i < 5);
        // System.out.println("Loop ends here");

        // for (int i = 0; i < 50; i++) {
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // continue;
        // }
        // System.out.println(i);
        // System.out.println("Java is great");
        // }

        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        } while (i < 5);
        System.out.println("Loop ends here");
    }
}
