package binarysearch;


//Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
//2. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//3. Given the sorted rotated array nums of unique elements, return the minimum element of   this array.
//4. You must write an algorithm that runs in O(log n) time.
//Constraints
//n == nums.length
//1 <= n <= 5000
//-5000 <= nums[i] <= 5000
//All the integers of numbers are unique.
//nums is sorted and rotated between 1 and n times.
//Sample Input
//6
//5 6 1 2 3 4
//Sample Output
//1


public class smallestElement {
   public static int smallest(int []arr, int n) {
	   int low =0;
	   int high=n-1;
	   int ans= Integer.MAX_VALUE;
	 
	   
	   
	   while(low<=high) {
		 int mid= (low+high)/2;                  //[5,6,1,2,3,4]
		 
		 if(arr[low]<=arr[mid]) {
			if(arr[low]<ans) {
				
				ans=arr[low];
			}
			 low=mid+1;
		 }else {

              if(arr[mid]<ans) {
            	  ans=arr[mid];
            	  
              }
			 high=mid-1;
		 }
	   }
	   return ans;
   }
   
   
   public static void main(String[] args) {
	   int[]arr= {2,3,4,5,6,1};
		int n=6; 
		int abc = smallest (arr,n);
		System.out.println("Smallest element=  "+abc);
		
}
   
   
}
