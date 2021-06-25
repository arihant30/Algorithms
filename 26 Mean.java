class Solution {
    static int mean(int N , int[] A) {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];   
        }
        int mean=sum/N;
        return (int)(Math.floor(mean));
    }
};
