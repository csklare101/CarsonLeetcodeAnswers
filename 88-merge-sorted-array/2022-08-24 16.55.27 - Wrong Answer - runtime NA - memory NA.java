class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] fin  = new int[m+n];
        if(m != 0){
            for(int i = 0; i < m; i++){
                fin[i] = nums1[i];
            }
        }
        if(n != 0){
            for(int i = 0; i < n; i++){
                fin[i+m] = nums2[i];
            }
        }
        Arrays.sort(fin);
        nums1 = fin;
    }
}