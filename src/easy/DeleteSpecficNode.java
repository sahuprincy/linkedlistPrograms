package easy;

public class DeleteSpecficNode {

	public static void main(String[] args) {

		Node node = new Node(-3);
		node.next = new Node(-25);
		node.next.next = new Node(1);
		node.next.next.next = new Node(9);
		deleteNode(node.next);
		print(node);
	}
/**
 * 1. Take the Temp node
 * 2. node.next= temp, node .next =temp.next, node.data= temp.data
 * 
 * 
 * */
	public static void deleteNode(Node node) {

		Node temp = node.next;
		node.val = temp.val;
		node.next = temp.next;

	}

	public static void print(Node node) {

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}

}
