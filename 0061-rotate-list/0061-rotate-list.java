class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 1; 
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        
        k = k % length;
        if (k == 0) {
            return head; 
        }
        
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
      
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null; 
        fast.next = head; 
        return newHead; 
    }
}
