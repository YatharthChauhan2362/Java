// Creating Our Own Java Class
// This Program was Created By Yatharth Chauhan

// Writing a Custom Class :
// Syntax of a custom class :

// class <class_name>{
// field;
// method;
// }

// Example :
// public class Employee {
// int id; // Attribute 1
// String name; // Attribute 2
// }

// Note: The first letter of a class should always be capital.

// Any real-world object = Properties + Behavior
// Object in OOPs = Attributes + Methods

// A Class with Methods :
// We can add methods to our class Employee as follows:

// public class Employee {
// public int id;
// public String name;

// public int getSalary() {
// // code
// }

// public void getDetails() {
// // code
// }
// };

class Employee_ {

    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class _25_java_class {
    public static void main(String[] args) {

        System.out.println("This is our custom class");

        Employee_ yatharth = new Employee_(); // Instantiating a new Employee Object
        Employee_ riya = new Employee_(); // Instantiating a new Employee Object

        // Setting Attributes for yatharth
        yatharth.id = 19;
        yatharth.salary = 90000;
        yatharth.name = "Yatharth Chauhan";

        // Setting Attributes for riya
        riya.id = 16;
        riya.salary = 70000;
        riya.name = "Riya Chauhan";

        // Printing the Attributes
        yatharth.printDetails();
        riya.printDetails();

        int salary = yatharth.getSalary();
        System.out.println(salary);

        int salary_ = riya.getSalary();
        System.out.println(salary_);

        // System.out.println(yatharth.id);
        // System.out.println(yatharth.name);
    }
}
