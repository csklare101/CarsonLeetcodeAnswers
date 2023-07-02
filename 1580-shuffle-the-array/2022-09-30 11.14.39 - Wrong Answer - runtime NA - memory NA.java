
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int x = 0; x <= n; x+=2){
            if(x == 0){
                ans[x] = nums[x];
                //System.out.println("X: " + x);
                //System.out.println("nums[X]: " + nums[x]);
               // System.out.println("ans[X]: " + ans[x]);
            }
            else{
                ans[x] = nums[x-1];
                //System.out.println("X: " + x);
                //System.out.println("nums[X]: " + nums[x]);
                //System.out.println("ans[X]: " + ans[x]);
            }
            if(x == n-1){
                ans[x+2] = nums[x];
                //System.out.println("X: " + x);
                //System.out.println("nums[X]: " + nums[x]);
                //System.out.println("ans[X]: " + ans[x]);
            }
        }
        //for(int i = 0; i < nums.length; i++){
            //System.out.print(ans[i] + " ");
        //}
        for(int y = n; y < nums.length; y++){
            if(y == n && n % 2 == 0){
                ans[n-1] = nums[y];
            }
            else if(y == n && n % 2 != 0){
                ans[n-(n-1)] = nums[y];
            }
            else if(y == nums.length-1){
                ans[y] = nums[y];
            }
            else{
                ans[y-1] = nums[y];
            }
            //System.out.println();
            //for(int i = 0; i < nums.length; i++){
                //System.out.print(ans[i] + " ");
        //}
        }
        return ans;
    }
}