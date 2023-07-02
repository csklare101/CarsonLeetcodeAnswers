class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I': num += 1;
                    break;
                case 'V': 
                    if(s.charAt(i-1) == 'I'){
                        num -= 1;
                    }
                    num += 5;
                    break;
                case 'X': 
                    if(s.charAt(i-1) == 'I'){
                        num -= 1;
                    }
                    num += 10;
                    break;
                case 'L':
                    if(s.charAt(i-1) == 'X'){
                        num -= 10;
                    }
                    num += 50;
                    break;
                case 'C': 
                    if(s.charAt(i-1) == 'X'){
                        num -= 10;
                    }
                    num += 100;
                    break;
                case 'D':
                    if(s.charAt(i-1) == 'C'){
                        num -= 100;
                    }
                    num += 500;
                    break;
                case 'M': 
                    if(s.charAt(i-1) == 'C'){
                        num -= 100;
                    }
                    num += 1000;
                    break;
                default:
                    break;
            }
        }
        return num;
    }
}