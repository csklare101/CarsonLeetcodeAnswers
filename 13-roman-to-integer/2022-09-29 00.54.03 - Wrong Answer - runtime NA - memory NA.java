class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I': num += 1;
                    break;
                case 'V': 
                    if(i > 0 && s.charAt(i-1) == 'I'){
                        num += 4;
                    }
                    else{
                        num += 5;
                    }
                    break;
                case 'X': 
                    if(i > 0 && s.charAt(i-1) == 'I'){
                        num += 9;
                    }
                    else {
                        num += 10;
                    }
                    break;
                case 'L':
                    if(i > 0 && s.charAt(i-1) == 'X'){
                        num += 40;
                    }
                    else{
                        num += 50;
                    }
                    break;
                case 'C': 
                    if(i > 0 && s.charAt(i-1) == 'X'){
                        num += 90;
                    }
                    else{
                        num += 100;
                    }
                    break;
                case 'D':
                    if(i > 0 && s.charAt(i-1) == 'C'){
                        num += 400;
                    }
                    else{
                        num += 500;
                    }
                    break;
                case 'M': 
                    if(i > 0 && s.charAt(i-1) == 'C'){
                        num += 900;
                    }
                    else{
                        num += 1000;
                    }
                    break;
                default:
                    break;
            }
        }
        return num;
    }
}