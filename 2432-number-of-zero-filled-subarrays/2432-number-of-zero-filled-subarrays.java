class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long answer = 0; 
        long count = 0;  
        for (int num : nums) {
            if (num == 0) {
                count++; 
                answer += count; 
            } else {
                count = 0;
            }
        }
        
        return answer; 
    }
}
