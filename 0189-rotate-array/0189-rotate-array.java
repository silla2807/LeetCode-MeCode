class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums, int sidx, int eidx ){
        while(sidx<eidx ){
           int temp = nums[sidx];
            nums[sidx] = nums[eidx];
            nums[eidx] = temp;
            sidx++;
            eidx--;
        }
    }
}