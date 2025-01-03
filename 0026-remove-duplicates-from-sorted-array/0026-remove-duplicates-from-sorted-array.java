class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[start+1] = nums[i+1];
                start++;
            }
        }
        return start+1;
    }
}