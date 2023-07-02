class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> vals = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(vals.containsKey(c)){
                vals.put(c, vals.get(c)+1);
            }
            else{
                vals.put(c, 1);
            }
        }
        Set<Integer> intVals = new HashSet<Integer>(vals.values());
        return intVals.size() == 1;
    }
}