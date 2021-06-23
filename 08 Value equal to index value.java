class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==(i+1)){
                index.add(i+1);
            }
        }
        return index;
    }
}
