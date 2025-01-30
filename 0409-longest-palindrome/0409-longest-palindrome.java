class Solution {
    public int longestPalindrome(String s) {
       int[] hash = new int[58];
       int r = 0;

       for(char c : s.toCharArray()){
        hash[c-'A']++;
       }
       int odd = 0;
       for(int i=0;i<58;i++){
        if(hash[i]%2 == 0){
            r+=hash[i];
        }else {
            r+=hash[i]-1;
            odd = 1;
        }
       }
       return r+odd;
    }
}