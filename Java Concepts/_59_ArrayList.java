// ArrayList in Java: Demo & Methods
// This Program was created by Yatharth Chauhan

// The ArrayList class is the dynamic array found in the java.util package.

// The size of the normal array can not be changed, but ArrayList provides us
// the ability to increase or decrease the size.

// ArrayList is slower than the standard array, but it helps us to manipulate
// the data easily.

// How to declare an ArrayList :
// ArrayList<Integer> l1 = new ArrayList<>(); /*Creates an ArrayList object of
// integer type */

// Performing various operations on ArrayList :
// ArrayList comes with a number of methods that can be used to manipulate the
// data of the ArrayList. Let’s take a look at some of the important methods of
// ArrayList :

// 1. Adding an element :

// -> add() method is used to insert an element in the ArrayList.
// -> add(Object): Inserts an element at the end of the ArrayList.
// -> add(Index,Object) : Inserts an element at the given index.

// Removing an Element :
// remove() method is used to delete or remove an element at a given index from the ArrayList.
// Syntax :
// L1.remove(index number) 

// Checking if an ArrayList contains a specific value or not : 
// contains() method is used to check if an ArrayList contains a specified element or not. This method returns the boolean value.

// Merging two ArrayLists :
// The elements of an ArrayList can be merged into another Arraylist with the help of the addAll() method.

// Finding the first occurrence of a specified number in the ArrayList :
// Indexof() method prints the index of the first occurrence of a particular number. Returns -1 if the element is not present in the ArrayList.

import java.util.*;

public class _59_ArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        // l1.clear();
        l1.set(1, 566);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
