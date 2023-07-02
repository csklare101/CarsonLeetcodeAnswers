class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        int digits = 0;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] % 10 != 0){
                nums[i] /= 10;
                digits++;
            }
            System.out.println(digits);
            if(digits % 2 == 0){
                even++;
            }
            digits = 0;
        }
        return even;
    }
}