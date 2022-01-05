// File Handling in Java
// This Program was created by Yatharth Chauhan

// File handling is a crucial part of any programming language.
// In Java, file handling is done with the help of the File class of the java.io package.

// Common file handling operations :
// 1. Creating a new file.
// 2. Writing in a file.
// 3. Reading an existing file.
// 4. Deleting a file.

// To perform any of the above operations on a file in Java, we need to create an object of the File class as shown in the below code:

// import java.io.File;  // Importing the File class
// File obj = new File("filename.txt"); // Specify the name of the file

// Now, let's see how we can perform the above operation on a file in Java.

// 1. Creating a new file :
// createNewFile() method is used to create a new file.

// 2. Writing to a file :
// FileWriter class is used with its write() method to write some content in a file.
// Do not forget to use the close() method when you're finished writing to a file.

// 3. Reading a file :
// The Scanner class is used to read a file.
// It is important to enclose the method in a try-catch block to handle the IOException.

// 4. Deleting a file :
// The delete() method is used to delete a file in Java.

import java.io.File;

public class _73_File_Handling {
    public static void main(String[] args) {

        // Code to create a new file
        /*
         * File myFile = new File("cwh111file.txt"); try { myFile.createNewFile(); }
         * catch (IOException e) { System.out.println("Unable to create this file");
         * e.printStackTrace(); }
         * 
         * 
         * // Code to write to a file try { FileWriter fileWriter = new
         * FileWriter("cwh111file.txt");
         * fileWriter.write("This is our first file from this java course\nOkay now bye"
         * ); fileWriter.close(); } catch (IOException e) { e.printStackTrace(); }
         * 
         * // Reading a file File myFile = new File("cwh111file.txt"); try { Scanner sc
         * = new Scanner(myFile); while(sc.hasNextLine()){ String line = sc.nextLine();
         * System.out.println(line); } sc.close(); } catch (FileNotFoundException e) {
         * e.printStackTrace(); }
         */
        // Deleting a file

        File myFile = new File("cwh111file.txt");

        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
