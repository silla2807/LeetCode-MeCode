class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i) == '1'){
              list.add(i);
            }
        }
        for(int j =0;j<boxes.length();j++){
            int val = 0;
            for(int i=0;i<list.size();i++){
                if(list.get(i) !=j){
                   val+=Math.abs(list.get(i)-j);
                }
            }
           result[j] = val;
           System.out.println(result[j]);
        }
        return result;
    }
}