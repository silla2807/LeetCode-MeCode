class Solution {     
    public String countAndSay(int n) {         
        if(n == 1){             
            return "1";         
        }          
        String prev = countAndSay(n-1);         
        StringBuilder s = new StringBuilder();         
        int count = 1;         
        for(int i = 0; i < prev.length(); i++){             
            if(i < prev.length() - 1 && prev.charAt(i) == prev.charAt(i+1)){                 
                count++;             
            } else {                 
                s.append(count);                 
                s.append(prev.charAt(i));                 
                count = 1;          
            }         
        }         
        return s.toString();                    
    }     
}
