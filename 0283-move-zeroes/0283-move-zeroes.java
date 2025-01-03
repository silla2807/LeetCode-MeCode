class Solution {
    public void moveZeroes(int[] nums) {
        int zero =0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
               nums[index++] = nums[i];
            }else{
                zero++;
            }
        }

        while(zero>0){
            nums[index] = 0;
            index++;
            zero--;
        }
    }
}