package Lec35;

public class MergeTwoSortedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

			ListNode Dummy = new ListNode(0);
			ListNode temp = Dummy;
			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					Dummy.next = list1;
					Dummy = Dummy.next;
					list1 = list1.next;
				} else {
					Dummy.next = list2;
					Dummy = Dummy.next;
					list2 = list2.next;
				}
			}
			if (list1 != null) {
				Dummy.next = list1;
			}
			if (list2 != null) {
				Dummy.next = list2;
			}
			return temp.next;

		}
	}
}
