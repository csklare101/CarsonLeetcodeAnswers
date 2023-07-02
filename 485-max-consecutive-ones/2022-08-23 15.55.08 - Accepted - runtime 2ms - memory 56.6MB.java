class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int con = 0;
        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                con++;
            }
            else{
                if(con > longest){
                    longest = con;
                }
                con = 0;
            }
        }
        if(con > longest){
            longest = con;
        }
        return longest;
    }
}