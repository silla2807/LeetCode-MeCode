class Solution {
    public int fib(int n) {
        int p = 0;
        int c = 1;
        int res = 0;
        if( n == 1){
            return 1;
        }
        for(int i=1;i<n;i++){
           res = p + c;//1, 2
           p = c;//1,1,
           c = res;//1, 2
        }
        return res;
    }
}