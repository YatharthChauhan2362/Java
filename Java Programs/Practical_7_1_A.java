// Write a program to create thread which display "Hello World" message.
// A. by extending Thread class
// B. by using Runnable interface.

public class Practical_7_1_A extends Thread {

    public void run() {

        System.out.println("Hello World");

        System.out.println("\n20DCE019-Yatharth Chauhan");
    }

    public static void main(String[] args) {

        Practical_7_1_A obj = new Practical_7_1_A();
        obj.start();

    }
}