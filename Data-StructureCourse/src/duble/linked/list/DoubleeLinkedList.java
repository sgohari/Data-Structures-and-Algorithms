package duble.linked.list;

public class DoubleeLinkedList {

	private DoublyLinkedNode head;
	private int size=0;
	public void insertAtHead(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	public int length() {
		if (head == null)
			return 0;
		int length = 0;
		DoublyLinkedNode current = this.head;

		while (current != null) {
			length += 1;
			current = current.getNextNode();
		}
		return length;
	}
	/*
	public void display() {
		if(isEmpty())System.out.println("Empty");
		else {
			System.out.println(" The list is");
			DoubleLinkedNode<E> current=header;
			while(current!=null) {
				System.out.println(current.element);
				current=current.getNext();
			}
				
		}
	}
	public int size() {return size;}
	public boolean isEmpty(){return size==0;}*/

}
