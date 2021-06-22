class Solution {
    int sum(int arr[], int n) {
        int sum=0;
        n--;
	    while(n>=0){
	        sum+=arr[n];
	        n--;
	    }
	    return sum;
    }
}
