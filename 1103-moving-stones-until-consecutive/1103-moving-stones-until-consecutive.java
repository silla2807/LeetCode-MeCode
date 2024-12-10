class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] stones = {a, b, c};
        Arrays.sort(stones);
        
        int x = stones[0], y = stones[1], z = stones[2];

        int maxMoves = (z - x - 2); 
        int minMoves;
        if (z - y == 1 && y - x == 1) {
            minMoves = 0; 
        } else if (z - y <= 2 || y - x <= 2) {
            minMoves = 1; 
        } else {
            minMoves = 2; 
        }

        return new int[]{minMoves, maxMoves};
    }
}