class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int num;
        int rev = 0;
        for(int x2 = x; x2 != 0; x2 /= 10){
            num = x2%10;
            rev = rev*10+num;
            num = 0;
        }
        
        System.out.println(rev);
        if(rev != x){
            return false;
        }
        return true;
    }
}