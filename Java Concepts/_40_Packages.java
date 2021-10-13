// Packages in Java
// This Program was created by Yatharth Chauhan

// A package is used to group related classes.
// packages help in avoiding name conflicts
// There are two types of packages :

// Build-in packages - java API
// User-defined packages - Custom packages

// Using a java package :
// Import keyword is used to import packages in the java program. Example :

// import java lang * - import
// import java string - import string from java long
// s= new java long string ( " Yatharth " ) - use without importing

// Creating Packages in Java

// How to create a package in Java :

// javac -d Yatharth java
// The above code creates a packages folder.

// java Yatharth java
// The above code creates Yatharth class.

// We can also create inner packages by adding packages inner as the package
// name.
// These packages once created can be used by other classes.

import java.util.Scanner;

//import java.util.*;
public class _40_Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
        sc.close();
    }
}
