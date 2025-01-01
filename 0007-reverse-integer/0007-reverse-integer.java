class Solution {
    public int reverse(int x) {
        int r = 0;
        int n = Math.abs(x);
        while(n > 0){
            int d = n%10;
                if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && d > 7)) return 0; 
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && d < -8)) return 0;
            
            r = r*10+d;
            n= n/10;
        }
        return x<0 ? r*-1 : r;
    }
}