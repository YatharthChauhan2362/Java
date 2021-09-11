// Introduction to Arrays
// This Program was Created By Yatharth Chauhan

// An array is a collection of similar types of data having contiguous memory allocation.
// The indexing of the array starts from 0., i.e 1st element will be stored at the 0th index, 2nd element at 1st index, 3rd at 2nd index, and so on.
// The size of the array can not be increased at run time therefore we can store only a fixed size of elements in array.
// Use Case: Storing marks of 5 students

// Accessing Array Elements : 
// Array elements can be accessed as follows,

// marks[0] = 100       //Note that index starts from 0
// marks[1] = 70
// .                                  
// .
// marks[4] = 98 */
// So in a nut shell, this is how array works:

// int[] marks; //Declaration!
// marks = new int[5];           //Memory allocation!
// int[] marks = new int[5]; //Declaration + Memory allocation!
// int[] marks = {100,70,80,71,98} // Declare + Initialize!
// Note : Array indices start from 0 and go till (n-1) where n is the size of the array.

// Array length : 
// Unlike C/C++, we don't need to use the sizeof() operator to get the length of arrays in Java because arrays are objects in Java therefore we can use the length property.

// marks.length //Gives 5 if marks is a reference to an array with 5 elements

// An array can be displayed using a for loop:

// for (int i=0; i<marks.length; i++)
// {
//             Sout(marks[i]);    //Array Traversal
// }

public class _17_Arrays {
    public static void main(String[] args) {
        /*
         * Classroom of 500 students - You have to store marks of these 500 students You
         * have 2 options: 1. Create 500 variables 2. Use Arrays (recommended)
         */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int[] marks = { 98, 45, 79, 99, 80 };

        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
    }
}
