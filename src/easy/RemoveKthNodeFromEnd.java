package easy;

public class RemoveKthNodeFromEnd {

	public static void main(String[] args) {
		Node node = new Node(-3);
		node.next = new Node(-25);
		node.next.next = new Node(1);
		node.next.next.next = new Node(9);
		removeNthFromEnd(node, 2);
		print(node);
	}

	public static void print(Node node) {

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}
/**
 * 1. 2 node first and second .
 * 2. iterate first till n
 * 3. while(first!null)- first=first.next, second= secod.next
 * 4. second.next = second.next.next
 * */
	public static Node removeNthFromEnd(Node head, int n) {
		if(head==null) {
			return null;
		}
		
		Node firstNode = head;
		Node secondNode = head;
		
		
		for (int i = 0; i < n; i++) {
			firstNode = firstNode.next;

		}

		// first element
		if (firstNode == null) {
			head = head.next;
			return head;
		}

		while (firstNode.next != null) {
			firstNode = firstNode.next;
			secondNode = secondNode.next;

		}
		secondNode.next = secondNode.next.next;
		return head;

	}

}
