package single.linked.list.demo;

public class StringNode {

	
	// Defining fields
		public String data;
		//Defining a pointer to the next node. The type of it is the node name
		//Whenever you have an object, the name of an object essentially has the address of that object. 
		//In other words, it is a pointer...
		public StringNode next;

		public StringNode(String _data, StringNode _next) {
			this.data = _data;
			this.next = _next;
		}

		//Adding one method to return the data in the node
		public String toString() {
			return (data);
		}
}
