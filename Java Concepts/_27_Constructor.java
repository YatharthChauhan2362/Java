// Constructors in Java
// This Program was Created By Yatharth Chauhan

// Constructors are similar to methods,, but they are used to initialize an object.
// Constructors do not have any return type(not even void).
// Every time we create an object by using the new() keyword, a constructor is called.
// If we do not create a constructor by ourself, then the default constructor(created by Java compiler) is called.

// Rules for creating a Constructor :
// The class name and constructor name should be the same.
// It must have no explicit return type.
// It can not be abstract, static, final, and synchronized.

// There are two types of constructors in Java :

// Defaut constructor : A constructor with 0 parameters is known as default constructor.

// Syntax :
// <class_name>(){
//code to be executed on the execution of the constructor
// }  

// Paramerterized constructor : A constructor with some specified number of parameters is known as a parameterized constructor.

// Syntax :
// <class-name>(<data-type> param1, <data-type> param2,......)
// { 
//code to be executed on the invocation of the constructor
// }

class MyMainEmployee {

    private int id;
    private String name;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class _27_Constructor {
    public static void main(String[] args) {
        // MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        // harry.setName("CodeWithHarry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
