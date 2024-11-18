class Solution {
    public int fib(int n) {
        
        if( n == 1) return 1;
        if( n == 0) return 0;

        int prev = 0;
        int curr = 1;
        int res = 0;
       
        for(int i = 2; i <= n ; i++){
           res = prev + curr;//1, 2
           prev = curr;//1,1,
           curr = res;//1, 2
        }
        return res;
    }
}