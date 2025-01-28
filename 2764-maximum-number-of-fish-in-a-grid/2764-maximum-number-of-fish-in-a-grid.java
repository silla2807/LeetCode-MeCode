class Solution {
    public int findMaxFish(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxFish = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0) { 
                    maxFish = Math.max(maxFish, dfs(grid, r, c));
                }
            }
        }
        return maxFish;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        int fishCaught = grid[r][c];
        grid[r][c] = 0;
        fishCaught += dfs(grid, r + 1, c); 
        fishCaught += dfs(grid, r - 1, c); 
        fishCaught += dfs(grid, r, c + 1);
        fishCaught += dfs(grid, r, c - 1);

        return fishCaught;
    }
}
