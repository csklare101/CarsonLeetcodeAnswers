class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] % 10 != 0){
                nums[i] /= 10;
                count++;
            }
            if(count % 2 == 0){
                even++;
            }
        }
        return even;
    }
}