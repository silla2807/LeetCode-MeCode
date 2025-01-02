class Solution {
    
        static class Node{
            int open;
            int close;
            String s;

         Node(int open,int close,String s){
                 this.open = open;
                 this.close = close;
                 this.s = s;
            }
        }
        public List<String> generateParenthesis(int n) {

        Queue<Node> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        
        queue.add(new Node(0, 0,""));

        while(!queue.isEmpty()){
            Node currentNode = queue.poll();

             if (currentNode.open == n && currentNode.close == n) {
                list.add(currentNode.s);
                continue;
            }
            if(currentNode.open < n){
                queue.add(new Node(currentNode.open+1,currentNode.close,currentNode.s+"("));
            }

            if(currentNode.close < currentNode.open){
                queue.add(new Node(currentNode.open,currentNode.close+1,currentNode.s+")"));
            }
        }
        return list;
        
    }
}
