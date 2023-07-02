class Solution {
    public boolean check(int[] nums) {
        boolean check1 = false;
        boolean check2 = false;
        int pos = -1;
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                if(nums[i-1] > nums[i]){
                    if(check1){
                        return false;
                    }
                    else{
                        pos = i;
                        check1 = true;
                    }
                }
            }
        }
        System.out.println(pos);
        if(check1){
            for(int j = pos; j >= 0; j--){
                if(j > 0){
                    if(nums[j-1] > nums[j]){
                        if(check2){
                            return false;
                        }
                        else{
                            check2 = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}