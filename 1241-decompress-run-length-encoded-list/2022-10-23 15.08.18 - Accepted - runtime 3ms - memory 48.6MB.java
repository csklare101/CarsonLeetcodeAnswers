
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int endPoint = 0;
        for(int x = 0; x < nums.length; x++){
            if(x % 2 == 0){
                endPoint += nums[x];
            }
        }
        
        int[] result = new int[endPoint];
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
            }
        }
        
        return result;
    }
}