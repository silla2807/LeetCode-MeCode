class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = 0;

       //consider k=1, 
       //find min
       //multiply the element in the array at the index of min with the multiplier

       for(int i=0;i<k;i++){
        min=0;
        for(int j=0;j<nums.length;j++){
            min = nums[j] < nums[min] ? j : min; 
        }
        nums[min]*=multiplier;
    }
    return nums;
}
}