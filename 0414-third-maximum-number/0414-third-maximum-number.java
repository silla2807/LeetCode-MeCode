class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;         
        long secondMax = Long.MIN_VALUE;  
        long thirdMax = Long.MIN_VALUE;   

        for (int num : nums) {

            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max ) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != secondMax && num != max) {
                thirdMax = num;
            }
        }

        return thirdMax == Long.MIN_VALUE ? (int) max : (int) thirdMax;
    }
}