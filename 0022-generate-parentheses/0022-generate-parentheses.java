class Solution {
    static class Node {
        String currentString;
        int openP;
        int closeP;

        Node(String currentString, int openP, int closeP) {
            this.currentString = currentString;
            this.openP = openP;
            this.closeP = closeP;
        }
    }

     public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node("", 0, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.openP == n && node.closeP == n) {
                result.add(node.currentString);
                continue;
            }

            if (node.openP < n) {
                queue.add(new Node(node.currentString + "(", node.openP + 1, node.closeP));
            }

            if (node.closeP < node.openP) {
                queue.add(new Node(node.currentString + ")", node.openP, node.closeP + 1));
            }
        }

        return result;
        
    }
}