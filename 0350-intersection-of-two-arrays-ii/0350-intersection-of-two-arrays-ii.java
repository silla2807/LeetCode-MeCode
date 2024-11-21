class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        
        for (int num : map1.keySet()) {
            if (map2.containsKey(num)) {
                int count = Math.min(map1.get(num), map2.get(num));
                
                for (int i = 0; i < count; i++) {
                    res[index++] = num;
                }
            }
        }

        int[] result = new int[index];
        System.arraycopy(res, 0, result, 0, index);
        return result;
    }
}