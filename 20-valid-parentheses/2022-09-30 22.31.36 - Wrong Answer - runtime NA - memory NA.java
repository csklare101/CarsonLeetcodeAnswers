class Solution {
    public boolean isValid(String s) {
        boolean parenConnect = true;
        boolean sqParenConnect = true;
        boolean squigParenConnect = true;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(parenConnect == false){
                    return false;
                }
                parenConnect = false;
            }
            if(s.charAt(i) == '['){
                if(sqParenConnect == false){
                    return false;
                }
                sqParenConnect = false;
            }
            if(s.charAt(i) == '{'){
                if(squigParenConnect == false){
                    return false;
                }
                squigParenConnect = false;
            }
            
            if(s.charAt(i) == ')'){
                if(i == 0){
                    return false;
                }
                if((sqParenConnect == false || squigParenConnect == false) && s.charAt(i-1) != '('){
                    return false;
                }
                if(parenConnect != false){
                    return false;
                }
                parenConnect = true;
            }
            if(s.charAt(i) == ']'){
                if(i == 0){
                    return false;
                }
                if((parenConnect == false || squigParenConnect == false) && s.charAt(i-1) != '['){
                    return false;
                }
                if(sqParenConnect != false){
                    return false;
                }
                sqParenConnect = true;
            }
            if(s.charAt(i) == '}'){
                if(i == 0){
                    return false;
                }
                if((parenConnect == false || sqParenConnect == false) && s.charAt(i-1) != '{'){
                    return false;
                }
                if(squigParenConnect != false){
                    return false;
                }
                squigParenConnect = true;
            }
        }
        return (parenConnect && sqParenConnect && squigParenConnect);
    }
}