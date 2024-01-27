package binarysearch;

//Given an ascending sorted rotated array arr of distinct integers of size N. The array is right rotated K times. Your task is to find the value of K.
//Constraints
//1 <= N <=10^5
//1 <= arr[i] <= 10^7
//Sample Input
//6
//5 6 1 2 3 4
//Sample Output
//2




public class timesRotated {
    public static int rotated (int[]arr,int n) {
    	int low=0;
    	int high=n-1;
    	int ans= Integer.MAX_VALUE;     //biggest integer ke liye
    	int index=-1;
    	
    	// index track krenge apn kyuki smallest element ka index hi bata rh kitne br rotate hua h array.
    	while(low<=high) {
    		int mid = (low+high)/2;          //[5,6,1,2,3,4]
    		if(arr[low]<=arr[mid]) { //pivot element ya smallest element wala logic h (iss case me apn left side ko eliminate kr rhe)
    			if(arr[low]<ans) {  // ye isliye ki smallest element koi koi case me left side me bhi ho skta or agr by chance hua to wo
    				ans=arr[low];  // low me hi hoga 
    				index=low;
    			}
    			low=mid+1;
    		}else {
    			if(arr[mid]<ans) {   //same whi agr mid chotta h to whi answer rhega kyu ki right side eliminate hoga to smallest mid hoga uss case me.
    				ans=arr[mid];
    				index=mid;
    			}
    		high=mid-1;
    		}
    	}
    	return index;
    }
    
    public static void main(String[] args) {
		int[] arr= {7,8,1,2,3,4,5,6};
		int n =8 ;
		int abc = rotated(arr,n);
		System.out.println(abc);
				
	}
    // example arrays khatarnak wale = [1,2] [7,8,1,2,3,4,5,6] [4,5,1,2,3]
    
}
