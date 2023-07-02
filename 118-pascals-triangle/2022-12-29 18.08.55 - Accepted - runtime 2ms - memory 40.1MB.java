class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> finalList = new ArrayList<>();
        if(numRows == 1){
            List<Integer> li = new ArrayList<>();
            li.add(1);
            finalList.add(li);
            return finalList;
        }

        for(int i = 0; i < numRows; i++){
            List<Integer> ad = new ArrayList();
            if(i == 0){
                ad.add(1);
            }
            else{
                ad.add(1);
                if(i > 1){
                    List<Integer> test = finalList.get(i-1);
                    System.out.println(test);
                    for(int j = 1; j < i; j++){
   
                        if(j-1 < test.size() && j < test.size()){
                            ad.add(test.get(j-1) + test.get(j));
                        }
                        else if(j-1 < test.size() && j == test.size()){
                            ad.add(test.get(j-1) + 1);
                        }
                    }
                }
                ad.add(1);
            }
            finalList.add(ad);
        }
        return finalList;
    }
}