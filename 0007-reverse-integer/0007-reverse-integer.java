class Solution {
    public int reverse(int x) {
        int d = 0;
        int r = 0;
        int temp = x;
        x = Math.abs(x);
        while(x>0){
               d = x%10;
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && d > 7)) return 0; 
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && d < -8)) return 0;
            

            r = d+r*10;
            x = x/10;  
        }
         return (temp <0)? r*-1 : r;
    }
}