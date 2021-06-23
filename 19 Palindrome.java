class Solution
{
    public String is_palindrome(int n)
    {
        String y="Yes";
        String no="No";
        int temp=n;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n/=10;
        }
        if(reverse==temp) 
            return y;
        return no;
    }
}
