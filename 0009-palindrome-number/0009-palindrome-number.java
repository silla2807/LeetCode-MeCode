class Solution {
    public boolean isPalindrome(int x) {
        int r = 0;
        int temp = x;
        while(x > 0){
            int d = x%10;
            r = r*10+d;
            x = x/10;
        }     

        return temp == r;   
    }
}