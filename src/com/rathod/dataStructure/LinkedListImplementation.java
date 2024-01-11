package com.rathod.dataStructure;

import java.util.*;

public class LinkedListImplementation {

	public static void main(String args[]) {
		// Creating object of class linked list
		LinkedList<String> object = new LinkedList<String>();

		// Adding elements to the linked list
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		System.out.println("Linked list : " + object);

		// Removing elements from the linked list
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		System.out.println("Linked list after deletion: " + object);

		// Finding elements in the linked list
		boolean status = object.contains("E");

		if (status)
			System.out.println("List contains the element 'E' ");
		else
			System.out.println("List doesn't contain the element 'E'");

		// Number of elements in the linked list
		int size = object.size();
		System.out.println("Size of linked list = " + size);

		// Get and set elements from linked list
		Object element = object.get(2);
		System.out.println("Element returned by get() : " + element);
		object.set(2, "Y");
		System.out.println("Linked list after change : " + object);
	}
}

/*
 * 
 * Output: 
 * Linked list : [D, A, E, B, C, F, G] 
 * Linked list after deletion: [A, E, F] 
 * List contains the element 'E' Size of linked list = 3 Element returned
 * by get() : F Linked list after change : [A, E, Y]
 * 
 * Methods for Java LinkedList:

add​(int index, E element): This method Inserts the specified element at the specified position in this list.
add​(E e): This method Appends the specified element to the end of this list.
addAll​(int index, Collection c): This method Inserts all of the elements in the specified collection into this list, starting at the specified position.
addAll​(Collection c): This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.
addFirst​(E e): This method Inserts the specified element at the beginning of this list.
addLast​(E e): This method Appends the specified element to the end of this list.
clear​(): This method removes all of the elements from this list.
clone​(): This method returns a shallow copy of this LinkedList.
contains​(Object o): This method returns true if this list contains the specified element.
descendingIterator​(): This method returns an iterator over the elements in this deque in reverse sequential order.
element​(): This method retrieves, but does not remove, the head (first element) of this list.
get​(int index): This method returns the element at the specified position in this list.
getFirst​(): This method returns the first element in this list.
getLast​(): This method returns the last element in this list.
indexOf​(Object o): This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
lastIndexOf​(Object o): This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
listIterator​(int index): This method returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.
offer​(E e): This method Adds the specified element as the tail (last element) of this list.
offerFirst​(E e): This method Inserts the specified element at the front of this list.
offerLast​(E e): This method Inserts the specified element at the end of this list.
peek​(): This method retrieves, but does not remove, the head (first element) of this list.
peekFirst​(): This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
peekLast​(): This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
poll​(): This method retrieves and removes the head (first element) of this list.
pollFirst​(): This method retrieves and removes the first element of this list, or returns null if this list is empty.
pollLast​(): This method retrieves and removes the last element of this list, or returns null if this list is empty.
pop​(): This method Pops an element from the stack represented by this list.
push​(E e): This method Pushes an element onto the stack represented by this list.
remove​(): This method retrieves and removes the head (first element) of this list.
remove​(int index): This method removes the element at the specified position in this list.
remove​(Object o): This method removes the first occurrence of the specified element from this list, if it is present.
removeFirst​(): This method removes and returns the first element from this list.
removeFirstOccurrence​(Object o): This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
removeLast​(): This method removes and returns the last element from this list.
removeLastOccurrence​(Object o): This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
set​(int index, E element): This method replaces the element at the specified position in this list with the specified element.
size​(): This method returns the number of elements in this list.
spliterator​(): This method Creates a late-binding and fail-fast Spliterator over the elements in this list.
toArray​(): This method returns an array containing all of the elements in this list in proper sequence (from first to last element).
toArray​(T[] a): This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.

 */