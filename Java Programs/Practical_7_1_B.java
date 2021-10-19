// Write a program to create thread which display "Hello World" message.
// A. by extending Thread class
// B. by using Runnable interface.

public class Practical_7_1_B implements Runnable {

    public void run() {

        System.out.println("Hello World");

        System.out.println("\n20DCE019-Yatharth Chauhan");
    }

    public static void main(String[] args) {

        Practical_7_1_B ob = new Practical_7_1_B();

        Thread th = new Thread(ob);
        th.start();
    }
}
