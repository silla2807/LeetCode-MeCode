class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] subset = new int[26];
        
        for (String word : words2) {
            int[] temp = new int[26];
            for (char c : word.toCharArray()) {
                temp[c - 'a']++;
                subset[c - 'a'] = Math.max(subset[c - 'a'], temp[c - 'a']);
            }
        }

        for (String word : words1) {
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }

            boolean isValid = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < subset[i]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }
        return result;
    }
}
