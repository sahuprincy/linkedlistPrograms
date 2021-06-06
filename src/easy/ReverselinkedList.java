package easy;

public class ReverselinkedList {

	public static void main(String[] args) {

		Node node = new Node(3);
		node.next = new Node(25);
		node.next.next = new Node(1);
		node.next.next.next = new Node(9);
		print(node);
		Node reverseList = reverseList(node);
		print(reverseList);
	}

	public static void print(Node node) {

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}

	public static Node reverseList(Node head) {

		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		next = prev;

		return next;

	}

}
