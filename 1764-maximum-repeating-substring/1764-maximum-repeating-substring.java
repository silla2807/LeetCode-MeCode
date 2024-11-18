class Solution {
    public int maxRepeating(String sequence, String word) {
       String add = word;
       int count = 0;
       while(sequence.contains(word)){
        count++;
        word+=add;
       }
       return count;
    }
}
