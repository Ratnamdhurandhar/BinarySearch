//1. Given an array of integer numbers and an integer threshold, we will choose a positive integer divisor,
//divide all the array by it, and sum the division's result.
//Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
//2. Each result of the division is rounded to the nearest integer greater than or equal to that element.
//(For example: 7/3 = 3 and 10/2 = 5).
//3. It is guaranteed that there will be an answer.
//Constraints
//1 <= nums.length <= 5 * 10^4
//1 <= nums[i] <= 10^6
//nums.length <= threshold <= 10^6
//Sample Input
//4
//1 2 5 9
//6
//Sample Output
//5
//
package binarysearch;

public class thresold {

	
	 public static int divisor(int[]arr, int div) {
		
		 
		 int sum=0;
		 int n = arr.length;
		 for(int i =0 ;  i<n ; i++) {
			  sum +=   Math.ceil((double)(arr[i]) /(double)(div));
			 
				 
			 
		 }
		 return sum;
		 
	 }
	 
	 
	 public static int binary(int[]arr,int x) {
 int n = arr.length;
 if(n>x) {
			return -1; 
		 }
		 int low=1;
			int high= Integer.MIN_VALUE;
			
			//finding max
			for (int i = 0;i<arr.length;i++) {
				if(arr[i]>high) {                               // we can find max here only or we can call the above commented function also. leetcode
					high=arr[i];
				}
			}
		 
		 while(low<=high) {
			 int mid = (low+high)/2;
			 int sum = divisor(arr,mid);
			 if (sum<=x) {
				 high=mid-1;
			 }
			 else {
				 low=mid+1;
			 }
		 }
		 return low;
		 
	 }
	 public static void main(String[] args) {
		int []arr = {1, 2, 5, 9};
		int x =6;
		int ans1 = binary(arr,x);
		System.out.println(ans1);
	}
}
