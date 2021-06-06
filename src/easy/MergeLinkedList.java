package easy;

public class MergeLinkedList {

	public static void main(String[] args) {
		Node l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(4);
		l1.next.next.next = new Node(9);

		Node l2 = new Node(1);
		l2.next = new Node(2);
		l2.next.next = new Node(3);
		l2.next.next.next = new Node(4);

		Node mergedList = mergeTwoLists(l1, l2);
		System.out.print("output:: ");
		while (mergedList != null) {
			System.out.print(mergedList.val + " ");
			mergedList = mergedList.next;
		}
		System.out.println();
	}

	
	public static Node mergeTwoLists(Node l1, Node l2) {
		Node headNode = new Node(0);

		Node l3 = headNode;
		Node list1 = l1;
		Node list2 = l2;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				l3.next = list1;
				list1 = list1.next;
			} else {

				l3.next = list2;
				list2 = list2.next;
			}
			l3 = l3.next;

		}

		if (list1 != null) {
			l3.next = list1;

		}
		if (list2 != null) {
			l3.next = list2;
		}
		return headNode.next;
	}

}
