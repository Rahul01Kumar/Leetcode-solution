/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            // find the kth node
            ListNode kth = prevGroupEnd;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;

            // save next group start
            ListNode nextGroupStart = kth.next;

            // reverse current k-group
            ListNode prev = nextGroupStart;
            ListNode curr = prevGroupEnd.next;
            while (curr != nextGroupStart) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            // connect with previous group
            ListNode tmp = prevGroupEnd.next;
            prevGroupEnd.next = prev;
            prevGroupEnd = tmp;
        }

        return dummy.next;
    }
}
