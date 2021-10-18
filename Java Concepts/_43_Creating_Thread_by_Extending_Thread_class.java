// Creating a Thread by Extending Thread class
// This Program was created by Yatharth Chauhan

// Multithreading In Java :
// Used to maximize the CPU utilization.
// We don't want our CPU to be in a free state; for example, Func1() comes into
// the memory and demands any input/output process. The CPU will need to wait
// for unit Func1() to complete its input/output operation in such a condition.
// But, while Func1() completes its I/O operation, the CPU is free and not
// executing any thread. So, the efficiency of the CPU is decreased in the
// absence of multithreading.

// In the case of multithreading, if a thread demands any I/O operation, then
// the CPU will let the thread perform its I/O operation, but it will start the
// execution of a new thread parallelly. So, in this case, two threads are
// executing at the same time.

// Ways To Create A Thread In Java
// 1. By extending the thread class
// 2. By implementing Runnable interface

// Let's see how we can create a thread by extending the thread class.

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class _43_Creating_Thread_by_Extending_Thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
