class Solution {
    public boolean check(int[] nums) {
        boolean check1 = false;
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                if(nums[i-1] > nums[i]){
                    if(check1){
                        return false;
                    }
                    else{
                        check1 = true;
                    }
                }
            }
        }
        return true;
    }
}