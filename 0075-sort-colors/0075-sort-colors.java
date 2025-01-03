class Solution {
    public void sortColors(int[] nums) {
        int[] colours = new int[3];

        for(int num :nums){
            colours[num]++;
        }
        int index = 0;
        for(int i=0;i<colours.length;i++){
            System.out.println("colors count"+colours[i]);
           int count = colours[i];
           while(count>0){
             nums[index++] = i;
             count--;
           }
           for(int n : nums){
            System.out.println(n);
           }
        }
    }
}