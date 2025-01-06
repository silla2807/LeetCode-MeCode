class Solution {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        
        int count = 0, moves = 0;
        for (int i = 0; i < boxes.length(); i++) {
            result[i] = moves; 
            count += boxes.charAt(i) - '0'; 
            moves += count;
        }
        
        count = 0; 
        moves = 0;
        for (int i = boxes.length() - 1; i >= 0; i--) {
            result[i] += moves;
            count += boxes.charAt(i) - '0';
            moves += count; 
        }
        
        return result;
    }
}