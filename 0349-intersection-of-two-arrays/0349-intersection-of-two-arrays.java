class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int[] tempResult = new int[Math.min(nums1.length, nums2.length)];
        int resultIndex = 0;
        for (int i = 0; i < nums1.length; i++) {
            boolean isCommon = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    isCommon = true;
                    break;
                }
            }
            
            if (isCommon) {
                boolean isAlreadyAdded = false;
                for (int k = 0; k < resultIndex; k++) {
                    if (tempResult[k] == nums1[i]) {
                        isAlreadyAdded = true;
                        break;
                    }
                }
                
                if (!isAlreadyAdded) {
                    tempResult[resultIndex++] = nums1[i];
                }
            }
        }
        
        int[] result = new int[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            result[i] = tempResult[i];
        }
        
        return result;
    }
}