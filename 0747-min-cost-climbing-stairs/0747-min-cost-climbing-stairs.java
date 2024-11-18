class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev = cost[0];
        int curr = cost[1];
        
        for(int i=2; i<cost.length; i++){
            int temp = curr;
            curr = Math.min(prev+cost[i], curr+cost[i]);
            prev = temp;
        }

        return Math.min(prev,curr);
    }
}