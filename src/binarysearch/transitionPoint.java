package binarysearch;
//Question 11:-
//1. Given a sorted array containing only 0s and 1s, find the transition point.
//2. Transition Point is defined as 1's starting point.
//3. If there is no transition point, return -1.
//Constraints
//1 <= N <= 500000
//0 <= arr[i] <= 1
//Sample Input
//6
//0 0 0 0 1 1
//Sample Output
//4

public class transitionPoint {
            public static int point(int[]arr,int n) {
            	int low=0;
            	int high=arr.length-1;
           
            	while(low<=high) {
            		int mid=(low+high)/2;
            		if(arr[mid]==0) {
            			low=mid+1;
            		}else {
            			high=mid-1;
            		}
            			
            	}
            	return low;
            }
            
            public static void main(String[] args) {
          	int[] arr= {0,0,0,0,0,0,0,1};
          	int n=8;
          	int abc= point(arr,n);
          	System.out.println(abc);
}
}