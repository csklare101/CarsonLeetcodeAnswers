
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] result = new int[100];
        int endPoint = -1;
        int pos = 0;
        int freq = -1;
        int val = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                freq = nums[i];
                 val = nums[i+1];
            }
            if(freq > 0 && val > 0){
                int[] add = new int[freq];
                for(int j = 0; j < freq; j++){
                    add[j] = val;
                }
                for(int element : add){
                    result[pos] = element;
                    pos++;
                }
                freq = -1;
                val = -1;
                i = pos;
            }
            if(result[pos] == 0){
                endPoint = pos;
            }
            pos = i;  
        }
        int[] finalResult = new int[pos];
        System.out.println(endPoint);
        System.arraycopy(result, 0, finalResult, 0, pos);
        
        return finalResult;
    }
}