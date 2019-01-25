package duble.linked.list;

public class DubleLinkListTester {

	public static void main(String[] args) {


		DoubleeLinkedList numbers = new DoubleeLinkedList();
		numbers.insertAtHead(5);
		numbers.insertAtHead(10);
		numbers.insertAtHead(20);
		numbers.insertAtHead(100);
		numbers.insertAtHead(200);
		numbers.insertAtHead(500);
		
		int x = numbers.length();
		System.out.println(x+" ");
		

	}

}
