
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        if(n % 2 == 0){
            for(int x = 0; x <= n; x+=2){
                if(x == 0){
                    ans[x] = nums[x];
                }
                else{
                    ans[x] = nums[x-1];
                }
            }
            for(int y = n; y < nums.length; y++){
                if(y == n){
                    ans[n-(n-1)] = nums[y];
                }
                else if(y == nums.length-1){
                    ans[y] = nums[y];
                }
                else{
                    ans[y-2] = nums[y];
                }
            }
        }
        else{
        for(int x = 0; x <= n; x+=2){
                if(x == 0){
                    ans[x] = nums[x];
                }
                else{
                    ans[x] = nums[x-1];              
                }
                if(x == n-1){
                    ans[x+2] = nums[x];
                }
            }
            for(int y = n; y < nums.length; y++){
                if(y == n){
                 ans[n-(n-1)] = nums[y];
                }
                else if(y == nums.length-1){
                 ans[y] = nums[y];
             }
                else{
                    ans[y-1] = nums[y];
                }
            }
        }
        return ans;
    }
}