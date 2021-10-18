// Constructors from Thread class in Java
// This Program was created by Yatharth Chauhan

// The Thread class
// Below are the commonly used constructors of the thread class:

// 1. Thread ( )
// 2. Thread ( string )
// 3. Thread ( Runnable r )
// 4. Thread ( Runnable r, String name )

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("Thank you");
        // while(true){
        // System.out.println("I am a thread");
        // }
    }
}

public class _46_Constructors_from_Thread_class {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Yatharth");
        MyThr t2 = new MyThr("Riya");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}
