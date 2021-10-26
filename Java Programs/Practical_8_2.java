// Create a generic method for sorting an array of Comparable objects.

import java.util.*;

class Student implements Comparable<Student> {

    String Name;
    int javaMarks;

    Student(String name, int javaMarks) {

        this.Name = name;
        this.javaMarks = javaMarks;
    }

    public int compareTO(Student s) {

        return this.javaMarks - s.javaMarks;
    }

    public String toString() {

        return String.format("[%s,%d]", Name, javaMarks);
    }

    @Override
    public int compareTo(Student o) {

        return 0;
    }

}

public class Practical_8_2 {
    public static void main(String[] args) {

        Student[] s = new Student[4];

        s[0] = new Student("Yatharth", 98);
        s[1] = new Student("Khushbu", 91);
        s[2] = new Student("Deep", 89);
        s[3] = new Student("Raj", 85);

        System.out.println("Before sorting: " + Arrays.toString(s));
        System.out.println("");
        Arrays.sort(s);
        System.out.println("After sorting: " + Arrays.toString(s));

        System.out.println("\n20DCE019-Yatharth Chauhan");

    }
}
