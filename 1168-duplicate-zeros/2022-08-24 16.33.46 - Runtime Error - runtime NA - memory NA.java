class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(i+1 != arr.length || i > 0){
                if(arr[i] == 0 && arr[i-1] != 0){
                    for(int j = arr.length-2; j >= i+1; j--){
                        arr[j+1] = arr[j];
                    }
                    arr[i+1] = arr[i];
                }
            }
        }
    }
}