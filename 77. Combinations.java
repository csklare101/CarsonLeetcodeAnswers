class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> add = new ArrayList<>();
        backtrack(n,k,1,add,ret);
        return ret;
    }

    public void backtrack(int n, int k, int s, List<Integer> combine, List<List<Integer>> res){
        if(combine.size() == k){
            res.add(new ArrayList<>(combine));
            return;
        }
        for(int i = s; i <= n; i++){
            combine.add(i);
            backtrack(n,k,i+1,combine, res);
            combine.remove(combine.size()-1);
        }
    }
}
