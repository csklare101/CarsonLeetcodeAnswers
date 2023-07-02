class Solution {
    public boolean isValid(String s) {
        for(int i = 0; i < s.length(); i++){
            if(i+1 < s.length()){
                if(s.charAt(i) == '('){
                    if(s.charAt(i+1) != ')'){
                        return false;
                    }
                }
                if(s.charAt(i) == '['){
                    if(s.charAt(i+1) != ']'){
                        return false;
                    }
                }
                if(s.charAt(i) == '{'){
                    if(s.charAt(i+1) != '}'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}