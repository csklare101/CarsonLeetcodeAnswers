class Solution {
    public boolean isValid(String s) {
        boolean parenConnect = true;
        boolean sqParenConnect = true;
        boolean squigParenConnect = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                parenConnect = false;
            }
            if(s.charAt(i) == '['){
                sqParenConnect = false;
            }
            if(s.charAt(i) == '{'){
                squigParenConnect = false;
            }
            
            if(s.charAt(i) == ')' && parenConnect == false){
                parenConnect = true;
            }
            if(s.charAt(i) == ']' && sqParenConnect == false){
                sqParenConnect = true;
            }
            if(s.charAt(i) == '}' && squigParenConnect == false){
                squigParenConnect = true;
            }
        }
        return (parenConnect && sqParenConnect && squigParenConnect);
    }
}