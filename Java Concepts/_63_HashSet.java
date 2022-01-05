// HashSet in Java
// This Program was created by Yatharth Chauhan

// HashSet class uses a hash table for storing the elements.
// It implements the set interface.
// Duplicate values are not allowed.
// Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
// Allows null value.
// Best suited for search operations.

// Constructors Of HashSet :

// HashSet(): This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.
// HashSet(int initialCapacity): This constructor is used to create a new empty HashSet which has the capacity to store the specified number of elements and having a load factor of 0.75.
// HashSet(int initialCapacity, float loadFactor): This constructor is used to create a new empty HashSet with the capacity & load factor equal to specified integer and float value.
// HashSet(Collection<? extends E> c): This constructor is used to create a HashSet using the elements of collection c.

// 1. Inserting elements :
// add() method is used to add elements in HashSet.
// The insertion order of the elements does not remains preserved in HashSet.
// All the duplicate elements are ignored because the set contains only unique values.

// 2. Removing elements from the HashSet : 
// remove() method is used to delete the specified element from the HashSet.
// This method does not throws any exception if the specified element is not present in the HashSet.

// 3. Checking if the HashSet is empty or not :  
// isEmpty() method is used to check if there is any object in the HashSet or not.
// This method returns a boolean value.

// 4. Removing all the elements from the HashSet : 
// clear() method is used to remove all the elements from the HashSet at once.

//  5. Printing the size of the HashSet :
// size() method is used to get the size of the HashSet.

import java.util.HashSet;

public class _63_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}
