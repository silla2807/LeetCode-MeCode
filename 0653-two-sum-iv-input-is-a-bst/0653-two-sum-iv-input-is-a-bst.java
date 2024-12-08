/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
       Set<Integer> set = new HashSet<>(); 
       Queue<TreeNode> queue = new LinkedList<>();

       queue.offer(root);

       while(!queue.isEmpty()){
          TreeNode current = queue.poll();

          if(set.contains(k-(current.val))){
            return true;
          }else{
            set.add(current.val);
          }

          if(current.left != null){
            queue.offer(current.left);
          }

          if(current.right != null){
            queue.offer(current.right);
          }
       }
       return false;
    }
}