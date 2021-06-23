class Solution {
    int print2largest(int arr[], int n) {
        Arrays.sort(arr);
	    int index=n-2;
	    n--;
	    while(index>=0){
	        if(arr[index]<arr[n]){
	            return arr[index];
	        }
	        index--;
	    }
	    return -1;
	    
    }
}
