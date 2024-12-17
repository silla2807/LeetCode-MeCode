class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, right = 0, oddCount = 0, result = 0, prefixCount = 0;

        while (right < nums.length) {
            if (nums[right] % 2 == 1) {
                oddCount++;
                prefixCount = 0;
            }

            while (oddCount == k) {
                prefixCount++;
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                left++;
            }
            
            result += prefixCount;
            right++;
        }
        return result;
    }
}
