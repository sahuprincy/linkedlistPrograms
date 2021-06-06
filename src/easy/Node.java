package easy;

public class Node {

	int val;
	Node next;

	Node(int x) {
		val = x;
	}

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}
