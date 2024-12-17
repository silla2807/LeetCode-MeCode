class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
         return 0;
        int result = 1;
        Set<Integer> set = new HashSet<>();
         for(int num : nums)
           set.add(num);

        for(int num : nums){
            if(!set.contains(num-1)){
                int curr = num;
                int count =0;
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                result = Math.max(count,result); 
            }
        }
        return result;
    }
}