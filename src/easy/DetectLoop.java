package easy;

import java.util.HashSet;

public class DetectLoop {

	public static void main(String[] args) {
		Node list = new Node(3);
		list.next = new Node(2);
		list.next.next = new Node(0);
		list.next.next.next = new Node(-4);

		list.next.next.next = list.next;

		boolean detectLoop = hasCycle(list);
		System.out.println(detectLoop);

	}

	public static boolean hasCycle(Node head) {

		HashSet<Node> s = new HashSet<Node>();
		while (head != null) {
			// If we have already has this node
			// in hashmap it means their is a cycle
			// (Because you we encountering the
			// node second time).
			if (s.contains(head))
				return true;

			// If we are seeing the node for
			// the first time, insert it in hash
			s.add(head);

			head = head.next;
		}

		return false;
	}

}
