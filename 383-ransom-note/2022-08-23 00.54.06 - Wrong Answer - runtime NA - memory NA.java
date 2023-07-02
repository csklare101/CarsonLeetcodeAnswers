class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            char rc = ransomNote.charAt(i);
            int match = magazine.indexOf(rc);
            if(match == -1){
                return false;
            }
        }
        return true;
    }
}