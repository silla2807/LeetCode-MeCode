class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int[] bottom = new int[n+1];
        bottom[0] = 0;
        bottom[1] = 1;
        for(int i=2;i<=n;i++){
            bottom[i] = bottom[i-1]+bottom[i-2];
        }
        return bottom[n];
    }
}