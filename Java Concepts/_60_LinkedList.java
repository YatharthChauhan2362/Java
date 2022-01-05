// LinkedList in Java: Demo & Methods
// This Program was created by Yatharth Chauhan

// The LinkedList class in Java provides us with the doubly linked list data
// structure.

// Each element of the linked list is known as a node.

// Each node points to the address of the next node & its previous node.

// Linked lists are preferred over the Array list because the insertion &
// deletion in the linked lists can be done in a constant time. But, in arrays,
// if we want to add or delete an element in between then, we need to shift all
// the other elements.

// In a linked list, it is impossible to directly access an element because we
// need to traverse the whole linked list to get the desired element.

// ArrayList Vs. LinkedList :
// Although ArrayList & LinkedList both implement the List interface and have
// the same methods, it is important to understand when to use which one.

// The insertion & deletion can be done in constant time in Linked List, so it
// is best to use the linked list when you need to add or remove elements
// frequently.

// Use ArrayList when you want to access the random elements frequently, as it
// can’t be done in a linked list in constant time.

// Performing various operations on LinkedList :

// 1. Adding Element in LinkedList:

// Similar to ArrayList, add() method is used to add elements in a linked list.
// add(Object): Inserts an element at the end of the ArrayList.
// add(Index,Object) : Inserts an element at the given index.

// 2. Removing an element from the LinkedList:
// remove() method is used to remove an element from the linked list.

//3. Changing An Element Of Linked List :
// set() method is used to change an already existing element of a linked list.

// 4. Inserting an element at the last of the linked list:
// addlast() method is used to insert an element at the start of the linked
// list.

// 5. Inserting an element at the start of the linked list:
// addFirst() method is used to insert an element at the start of the linked
// list.

import java.util.*;

public class _60_LinkedList {
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
