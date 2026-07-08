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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null){
 return true;


        }
        
        ListNode prev = null;
        ListNode next = null;
        while(fast != null && fast.next != null){
slow = slow.next;
 fast = fast.next.next;


        }
         ListNode current = slow;
       
        while(current != null){
next = current.next;
current.next = prev;
prev = current;
current = next;


        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
          if(first.val != second.val){

return false;

          }
          first = first.next;
          second = second.next;
        }
    return true;
        
    }
}