//1. Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//2. Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas
//from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//3. Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//4. Return the minimum integer k such that she can eat all the bananas within h hours.
//Constraints
//1 <= piles.length <= 10^4
//piles.length <= h <= 10^9
//1 <= piles[i] <= 10^9
//Sample Input
//4
//3 6 7 11
//8
//Sample Output
//4


package binarysearch;



public class koko_eating_banana  {
//	public static int findingmax (int[]arr) {
//		int max = Integer.MIN_VALUE;
//		int n = arr.length;                          // first we have to find the maximum element of the array . one of the way to find maximum.
//		
//		for (int i=0 ; i<n; i++) {
//			max= Math.max(max, arr[i]);
//		}
//		return max;
//	}
//	
	public static int totalHours (int[]arr,int hour) {
		int totalh=0;                                                 // total hours on which koko will eat bananas 
		int n = arr.length;
		for(int i =0 ; i<n ; i++) {
			totalh += Math.ceil((double)(arr[i]) /(double)(hour));             //math.ceil will round of the decimal integer to the nearest bigger(ceil) number.
		}
		return totalh;
	}
	
	public static int minibanana (int[]arr , int h) {
		int low =0;                                             //search space is 0-maximum element
		int high= Integer.MIN_VALUE;
		
		//finding max
		for (int i = 0;i<arr.length;i++) {
			if(arr[i]>high) {                               // we can find max here only or we can call the above commented function also. leetcode
				high=arr[i];
			}
		}
		//int ans=-1;
		
		
		
		while(low<=high) {
			                                              //minimum time required to eat all banana
		
		int mid= (low+high)/2;
		
		int totalh = totalHours (arr, mid);
		if (totalh <=h) {
			
			high=mid-1; 
		}else {
			low=mid +1;
		}
		
	}
	return low;
	
}
	
	public static void main(String[] args) {
		int []arr= {3,6,11,7};
		int h=8;
		int ans1 = minibanana(arr,h);
		System.out.println(ans1);
	}
}
