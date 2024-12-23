/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node current = head;
        helper(current);
        return head;
    }
    public Node helper(Node current){
        Node last = null;
        while(current != null){
            Node next = current.next;
            if(current.child != null){
              Node lastchild = helper(current.child);
              System.out.println(lastchild.val);
              current.next = current.child;
              current.child.prev = current;
              if(next != null) {
                    lastchild.next = next;
                    next.prev = lastchild;
              }
                current.child = null;
                last = lastchild;
            }  else {
                last = current;
            }
            current = next;
        }
         return last;
    }
}