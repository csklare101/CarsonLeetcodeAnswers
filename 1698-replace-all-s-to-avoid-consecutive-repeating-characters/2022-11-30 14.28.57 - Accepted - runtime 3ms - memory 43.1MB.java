class Solution {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if(chars.length == 1){
            return "a";
        }
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '?'){
                if(i == 0){
                    for(int j = 0; j < alphabet.length; j++){
                        if(alphabet[j] != chars[i+1]){
                            chars[i] = alphabet[j];
                            break;
                        }
                    }
                }
                
                else if(i > 0 && i != chars.length-1){
                    for(int j = 0; j < alphabet.length; j++){
                        if(alphabet[j] != chars[i+1] && alphabet[j] != chars[i-1]){
                            chars[i] = alphabet[j];
                            break;
                        }
                    }
                }
                else if(i == chars.length-1){
                     for(int j = 0; j < alphabet.length; j++){
                        if(alphabet[j] != chars[i-1]){
                            chars[i] = alphabet[j];
                            break;
                        }
                    }
                }
            }
        }
        
        String ans = String.valueOf(chars);
        return ans;
    }
}