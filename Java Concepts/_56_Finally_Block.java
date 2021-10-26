// Finally Block in Java & Why is it needed!
// This Program was created by Yatharth Chauhan

// Java finally block
// Finally block contains the code which is always executed whether the
// exception is handled or not.

// It is used to exception is handled or not.
// It is used to execute code containing instructions to release the system
// resources, close a connection etc.

public class _56_Finally_Block {
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try {
            System.out.println(50 / 3);
        } finally {
            System.out.println("Yes this is finally");
        }
    }
}
