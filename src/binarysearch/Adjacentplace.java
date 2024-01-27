package binarysearch;
//Question 10:-
//Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to search an element in this array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1]. For example, consider the array {2, 3, 10, 4, 40}, 4 is moved to the next position and 10 is moved to the previous position.
//Example :  
//Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
//Output: 2 
//Output is index of 40 in given array
//
//Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 90
//Output: -1
//-1 is returned to indicate element is not present

public class Adjacentplace {
  public static int nearly( int[]arr, int x) {
	  int low=0;
	  int high=arr.length-1;
	  
	  
	  while(low<=high) {
		  int mid=(low+high)/2;
		  
		  if(arr[mid]==x) {            
			  return mid;
		  }else if(mid-1>0 && arr[mid-1]==x) {             //checking for previous elemnt
			  return mid-1;
		  }else if (mid+1<high && arr[mid+1]==x) {
			  return mid+1;                                   //checking for the next element
			  
		  }else if(arr[mid]<x) {
			  low=mid+2;                                    // we already checked for +1 thats why checking for +2
		  }else {
			  high=mid-2;
		  }
	  }
	  return -1;
  }
  
  
  
  public static void main(String[] args) {
	int[] arr= {10,5,20,30,40};
	int x=5;
	int abc= nearly(arr,x);
	System.out.println(abc);
}
}
