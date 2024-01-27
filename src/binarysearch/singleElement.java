package binarysearch;
// single like me
//Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice.
//Constraints -> O(1), O(logN)
//10^5 <= N <= 10^5
//Sample Input
//11
//1 1 2 2 4 4 7 7 8 10 10
//Sample Output
//8

public class singleElement {
   public static int single(int[]arr, int n) {
	   int low=1;
	   int high=n-1;
	   
	   if(n==1) {
		   return arr[0];  // ye[1] ese type ke case ke liye h.
	   }
	   if(arr[0]!=arr[1]) {            // first element ke liye check kr rhe isme 
		   return arr[0];
	   }
	   if(arr[n-1]!=arr[n-2]) {    //last element ke liye
		   return arr[n-1];
	   }
	   
	   while(low<=high) {
		   int mid = (low+high)/2;
		   if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
			   return arr[mid];
		   }
		   if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]== arr[mid+1])){  // double bracket or || ka dhyan rkhna
			   
			   low=mid+1;
		   }
		   else {
			   high=mid-1;
		   }
	   }
	   return -1;
	   
   }
   

public static void main(String[] args) {  
	int[]arr= {1, 1, 2, 2, 4, 4, 7, 7, 8, 10, 10};
	int n=11; 
	int abc = single (arr,n);
	System.out.println(" "+abc);
}}
