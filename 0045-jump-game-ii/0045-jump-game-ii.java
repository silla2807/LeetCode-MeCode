class Solution {
    public int jump(int[] nums) {
         if (nums.length == 1) {
            return 0; 
        }
        int current = 0;
        int maxReach = 0;
        int  jump = 0;
        for(int i=0;i<nums.length;i++){
            maxReach = Math.max(maxReach, i+ nums[i]);
         if(i == current){
            jump++;
            current = maxReach;
             if(current >= nums.length-1){
               return jump;
            }
         }
           
        }
        return jump;
    }
}