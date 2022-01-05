// ArrayDeque in Java
// This Program was created by Yatharth Chauhan

// ArrayDeque=Resizable array+Deque interface.
// ArrayDeque implements the Queue&Deque interface.
// There are no capacity restrictions for ArrayDeque,and it provides us the facility to add or remove any element from both sides of the queue.
// Also known as Array Double Ended Queue.
// It is faster than Linked list and stack.
// Constructors of ArrayDeque class:
// ArrayDeque():Used to create an empty array deque that has the capacity to hold 16 elements.
// ArrayDeque(int numElements):Used to create an empty array deque that has the capacity to hold the specified number of elements.
// ArrayDeque(Collection<?extends E>c):Used to create an array deque containing all the elements of the specified collections.

// Performing Various Operation On ArrayDeque():

// 1. Inserting an element:
// Insertion at front:add(),offerFirst()and addFirst()methods are used to insert an element at front of an array deque.
// Insertion At End:addLast()and offerLast()methods are used to insert an element at the end of the array deque.

// 2. Accessing an element:Accessing an element from the head of the deque array:getFirst()&peekFirst()methods are used to get the first element of the deque array.
// Accessing the last element:getLast()or peekLast()methods are used to print the last element of the deque array.

// 3. Removing an element:Removing the first element:removeFirst()&pollFirst()methods are used to delete an element from the head of the queue.removeFirst()throws an exception if the queue is empty.pollFirst()returns null if the queue is empty.
// Removing the last element:removeLast()&pollLast()methods are used to delete an element from the tail of the queue.

import java.util.ArrayDeque;

public class _61_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
