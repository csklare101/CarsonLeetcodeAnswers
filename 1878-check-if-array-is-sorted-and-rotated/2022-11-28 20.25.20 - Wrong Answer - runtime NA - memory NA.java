class Solution {
    public boolean check(int[] nums) {
        boolean check1 = false;
        int pos = -1;
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                if(nums[i-1] > nums[i]){
                    if(check1){
                        return false;
                    }
                    else{
                        pos = i-1;
                        check1 = true;
                    }
                }
            }
        }
        if(check1){
            if(nums[pos] < nums[nums.length-1]){
                return false;
            }
        }
        return true;
    }
}