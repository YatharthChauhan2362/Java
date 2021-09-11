// For Each Loop in Java For each loop is an enhanced version of for loop.
// This Program was Created By Yatharth Chauhan

// It travels each element of the data structure one by one.
// Note that you can not skip any element in for loop and it is also not
// possible to traverse elements in reverse order with the help of for each
// loop.
// It increases the readability of the code.
// If you just want to simply traverse an array from start to end then it is
// recommended to use for each loop.

// Syntax:

// for (int element:Arr) {
// Sout(element); //Prints all the elements
// }

// Example:

// class CWH_forEachLoop {
// public static void main(String args[]){
// declaring an array
// int arr[]={1,2,3,3,4,5};
// traversing the array with for-each loop
// for(int i:arr){
// System.out.println(i);
// }
// }
// }

// Output:1 2 3 4 5

public class _18_for_each_loop {
    public static void main(String[] args) {

        /*
         * float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f}; String [] students
         * ={"Harry", "Rohan", "Shubham", "Lovish"};
         * System.out.println(students.length); System.out.println(students[2]);
         */

        int[] marks = { 98, 45, 79, 99, 80 };
        // System.out.println(marks.length);

        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element : marks) {
            System.out.println(element);
        }

    }
}
