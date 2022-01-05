// Java Generics
// This Program was created by Yatharth Chauhan

// Introduced from JDK 5.0 onwards.
// -> The Java Generics helps us to deal with the compiler time type-safety.
// -> With the help of the Generics, we can write a single method and call it with
// -> different argument types(integer, strings, etc.).

// Advantages of Generics :

// 1. Bugs can be detected at compile-time:

// -> While developing any application or program, it is always better to catch the
// bug/problem at the compile-time instead of runtime so that we can provide a
// smooth experience to the user.
// -> Let's take an example to see how Java Generics helps us to detect problems at
// compile-time

// 2. Type-casting not required :
// Let's suppose you created an ArrayList(without using Generics), and you want to store the value at index 0 into an integer variable named "x." Are you allowed to do this in Java? The answer is a big NO! This is because the ArrayList returns an object, but we're storing the value in an integer variable. In such cases, we need to type-cast the object into our desired data type. But, if we use Generics, then there is no need to typecast. Take a look at the below example to get a better understanding :

import java.util.ArrayList;

class MyGeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class _72_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        // ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
        // arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
        // arrayList.add(new Scanner(System.in));

        int a = (int) arrayList.get(0);
        // System.out.println(a);
        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
