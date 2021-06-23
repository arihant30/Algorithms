class Solution {
    static String armstrongNumber(int n){
        
        int cube = 0;
        int temp = n;
        while( n != 0){
            int num = n % 10;
            cube += num*num*num;
            n/= 10;
        } 

        return cube == temp ? "Yes":"No";



    }
}
