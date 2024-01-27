package binarysearch;

//Question 7:-
//
//1. There is an integer array nums sorted in ascending order (with distinct values).
//2. nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//3. Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//4. You must write an algorithm with O(log n) runtime complexity.
//Constraints
//1 <= nums.length <= 5000
//-10^4 <= nums[i] <= 10^4
//All values of numbers are unique.
//nums is guaranteed to be rotated at some pivot.
//-10^4 <= target <= 10^4
//Sample Input
//7
//4 5 6 7 0 1 2
//1
//Sample Output
//5
//






public class indexPivot {
  public static int indexOfRotate (int[]arr,int n,int x) {
	  int low=0;
	  int high=n-1;
	 
	  int index =-1;          // game changer
	  
	  while(low<=high) {
		  int mid = (low+high)/2;
		  if(arr[mid]==x) {
			  return mid;
			
		  }if (arr[low]<=arr[mid]) {
			  if(arr[low]<=x && x<= arr[mid]) {              //same as pivot element search
				  high=mid-1;
			  }else {
			  low=mid+1;
		
		  }}
		  else {
			  if(arr[mid]<=x && x<= arr[high]) {
				  low=mid+1;
			  }else {                  // else lagana bhul jata hu 
			  high=mid-1;
			 
		  }
	  }
	  
  }
	  return index;            //game changer
  }
  public static void main(String[] args) {
	int [] arr= {4,5,6,7,0,1,2};
	int n =7;
    int x=1;
    int abc = indexOfRotate (arr,n,x);
    System.out.println(abc);
}
}
