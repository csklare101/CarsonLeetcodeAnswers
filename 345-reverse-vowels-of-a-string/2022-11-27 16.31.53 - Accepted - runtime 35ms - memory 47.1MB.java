class Solution {
    public String reverseVowels(String s) {
        Stack<Character> chars = new Stack<>();
        Queue<Integer> pos = new LinkedList<>();
        StringBuilder finalS = new StringBuilder(s);
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                chars.push(s.charAt(i));
                pos.add(i);
            }
        }

        for(int p : pos){
            finalS.setCharAt(p, chars.pop());
        }
        return finalS.toString();
    }
}