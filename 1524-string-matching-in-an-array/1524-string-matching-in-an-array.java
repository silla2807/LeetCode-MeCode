class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        //Arrays.sort(words, Comparator.comparingInt(String::length));
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i != j && words[j].contains(words[i])){
                     result.add(words[i]);
                     break;
                }
            }
        }
        return result;
    }
}