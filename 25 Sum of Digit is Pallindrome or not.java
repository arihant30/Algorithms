class Solution {
    int isDigitSumPalindrome(int N) {
        int temp=N;
        int sum=0;
        while(temp>0){
            temp=temp%10;
            sum+=temp;
            temp/=10;
        }
        
        int temp2=sum;
        int sum2=0;
        while(temp2>0){
            int nums=temp2%10;
            sum2=sum2*10+nums;
            temp/=10;
        }
        if(sum2==sum) return 1;
        return 0;
        }
}
