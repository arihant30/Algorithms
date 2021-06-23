class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        int count=0;
        --n;
        while(n>=0){
            if(arr[(int)n]<=x){
                count++;
            }
            n--;
        }
        return count;
    }
}
