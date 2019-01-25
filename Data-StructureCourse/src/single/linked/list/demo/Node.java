package single.linked.list.demo;

public class Node {

	private Node nextNode;
	private int data;

	// 0-arg constructor, 1-arg constructor, 2-arg constructor
	private Node() {
	}

	private Node(int val) {
		data = val;
	}

	private Node(int val, Node next) {
		data = val;
		nextNode = next;
	}

	@SuppressWarnings("unused")
	private void setData(int val) {
		this.data = val;
	}

	@SuppressWarnings("unused")
	private int getData() {
		return this.data;
	}

	@SuppressWarnings("unused")
	private void setNextNode(Node n) {
		this.nextNode = n;
	}

	@SuppressWarnings("unused")
	private Node getNextNode() {
		return this.nextNode;
	}
}
