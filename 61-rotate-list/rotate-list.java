class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null)
            return head;

        ListNode current = head;
        int count = 1;

        while(current.next != null){
            count++;
            current = current.next;
        }

        k = k % count;

        if(k == 0){
            return head;
        }

        current.next = head;

        int steps = count - k;

       for(int i = 0; i < steps; i++){
    current = current.next;
}

        head = current.next;
        current.next = null;

        return head;
    }
}