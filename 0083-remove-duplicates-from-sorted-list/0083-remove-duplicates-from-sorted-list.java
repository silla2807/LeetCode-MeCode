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
        ListNode current = head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(current != null && current.next != null){
            if(current.val != current.next.val){
               temp.next = current;
               temp = temp.next;
            } 
            current = current.next;
            }
            temp.next = current;
            return dummy.next;
        }
}