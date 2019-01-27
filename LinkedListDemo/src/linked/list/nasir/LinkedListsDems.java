package linked.list.nasir;

import java.util.LinkedList;

public class LinkedListsDems {

	public static void main(String[] args) {
		
		//create object of class linked list
		LinkedList <String> object = new LinkedList<String>();
		object.add("Nasir");
		object.add("Nazef");
		object.add("Noor");
		object.add("Ali");
		object.add("Mike");
		object.add("Walid");
		object.add("Jay");
		object.add("Jucy");
		object.add("Jack");
		object.add("Jeen");
		System.out.println("Linked List: "+object);

		//Removing elemets from the linked list
		object.remove("Nasir");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		System.out.println("Elements DELETED: "+object);
		
		//finding elements in the linked list
		boolean status = object.contains("a");
		if(status) {
			System.out.println("List Contain the name Jucy ");
		}else {
			System.out.println("List does not Contain the name Jucy ");

		}
		//System.out.println("Element "+object);
		//System.out.println("Fifth Element of List "+object.get(5));
		// size of list
		System.out.println("Size of the Link-List "+object.size());
		
		//Print an element from the object
		System.out.println("Display an Element of List "+object.get(2));
		
		//setting element of object to new name
		object.set(0, "WHAT");
		System.out.println("New Name is Added "+object);
		
		
	}

}
