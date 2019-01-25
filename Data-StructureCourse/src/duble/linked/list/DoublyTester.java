package duble.linked.list;

public class DoublyTester {

	public static void main(String[] args) {


		 DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
	        dll.addFirst(10);
	        dll.addFirst(34);
	        dll.addLast(56);
	        dll.addLast(364);
	        dll.iterateForward();
	        dll.removeFirst();
	        dll.removeLast();
	        dll.iterateBackward();
	}

}
