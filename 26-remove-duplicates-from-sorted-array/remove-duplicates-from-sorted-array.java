class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // Create linked list
        Node head = new Node(nums[0]);
        Node current = head;

        for (int i = 1; i < nums.length; i++) {
            current.next = new Node(nums[i]);
            current = current.next;
        }

        // Remove duplicates using linked-list logic
        current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        // Put linked-list result back into array
        current = head;
        int index = 0;

        while (current != null) {
            nums[index] = current.val;
            index++;
            current = current.next;
        }

        return index;
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}