class Solution {
    public boolean check(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                
                if(nums[i-1] > nums[i]){
                    
                    for(int j = i-1; j >= 0; j--){
                            if(j > 0){
                                if(nums[j-1] > nums[j]){
                                    return false;
                            }
                        }
                    }
                    
                }
            }
        }
        return true;
    }
}