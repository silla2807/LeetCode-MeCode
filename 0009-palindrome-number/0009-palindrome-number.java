class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, r =0;
        while(x > 0){
            r = (r*10)+(x%10);
            x =x/10;

        }
        return temp == r;
    }
}