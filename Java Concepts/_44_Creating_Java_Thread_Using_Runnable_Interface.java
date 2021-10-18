// Creating a Java Thread Using Runnable Interface
// This Program was created by Yatharth Chauhan

// In the previous tutorial, I told you that there are two ways to create a
// thread in java :

// 1. By Extending Thread Class
// 2. By implementing Runnable interface

// We've already seen how to create a thread by extending the thread class.

// Steps To Create A Java Thread Using Runnable Interface:

// 1. Create a class and implement the Runnable interface by using the
// implements
// keyword.
// 2. Override the run() method inside the implementer class.
// 3. Create an object of the implementer class in the main() method.
// 4. Instantiate the Thread class and pass the object to the Thread
// constructor.
// 5. Call start() on the thread. start()will call the run()method.

// Runnable Interface Vs Extending Thread Class :

// Since we've discussed both the ways to create a thread in Java. There might
// be a question in your mind that should we use the Runnable interface or
// Thread class to implement a thread in Java. Let me answer this question for
// you. The Runnable interface is preferred over extending the Thread class
// because of the following reasons :

// 1. As multiple inheritance is not supported in Java, it is impossible to extend
// the Thread class if your class had already extended some other class.
// 2. While implementing Runnable, we do not modify or change the thread's
// behavior.
// 3. More memory is required while extending the Thread class because each thread
// creates a unique object.
// 4. Less memory is required while implementing Runnable because multiple threads
// share the same object.

class MyThreadRunnable1 implements Runnable {
    public void run() {
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
    }
}

public class _44_Creating_Java_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
