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
    public ListNode modifiedList(int[] nums, ListNode head) {
HashSet<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
    for(int num : nums ){
        set.add(num);
    }
        while(current != null){
            if(set.contains(current.val)){
prev.next = current.next;

             }
             else{
                prev = current;
             }
             current = current.next;
        }
return dummy.next;
    }
}