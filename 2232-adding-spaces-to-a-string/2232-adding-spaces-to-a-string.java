class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i : spaces){
            sb.append(s.substring(index,i)).append(" ");
            index = i;
        }
        if(sb.length() != (s.length()+spaces.length)){
            sb.append(s.substring(index,s.length()));
        }
        return sb.toString();
    }
}