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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {

            // Check if current node starts a duplicate sequence
            if (current.next != null && current.val == current.next.val) {

                int duplicate = current.val;

                // Skip every node with the duplicate value
                while (current != null && current.val == duplicate) {
                    current = current.next;
                }

                // Connect previous unique node to first non-duplicate node
                prev.next = current;

            } else {

                // Current node is unique
                prev = current;
                current = current.next;
            }
        }

        return dummy.next;
    }
}