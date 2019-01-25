package duble.linked.list;

public class Node<E> {

	 E element;
     @SuppressWarnings("rawtypes")
	Node next;
     @SuppressWarnings("rawtypes")
	Node prev;

     @SuppressWarnings("rawtypes")
	public Node(E element, Node next, Node prev) {
         this.element = element;
         this.next = next;
         this.prev = prev;
     }
	
}
