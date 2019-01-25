package single.linked.list.demo;

public class IntNode {

	// Defining fields
	public int data;
	//Defining a pointer to the next node. The type of it is the node name
	//Whenever you have an object, the name of an object essentially has the address of that object. 
	//In other words, it is a pointer...
	public IntNode next;

	public IntNode(int _data, IntNode _next) {
		this.data = _data;
		this.next = _next;
	}

	//Adding one method to return the data in the node
	public String toString() {
		return (Integer.toString(data));
	}
}

