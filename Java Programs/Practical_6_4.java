// Write a program to copy data from one file to another file.
// If the destination file does not exist, it is created automatically. 

import java.io.*;

public class Practical_6_4 {
    public static void main(String[] args) throws Exception {

        try {

            FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("file2.txt");

            int x;

            while ((x = fis.read()) != -1) {
                fos.write(x);
            }

            System.out.println("Data is copied Successfully");

            fis.close();
            fos.close();

        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println("\n20DCE019-Yatharth Chauhan");
    }
}