class Solution {
    public int maxArea(int[] height) {
        int left=0, right = height.length-1;
        int volume = Integer.MIN_VALUE;
        while(left<right){
            int currentQuant = (right-left)*(Math.min(height[left],height[right]));
            volume=Math.max(volume,currentQuant);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return volume;
    }
}