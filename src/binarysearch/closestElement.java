//1. Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
//2. An integer a is closer to x than an integer b if:
//       |a - x| < |b - x|, or
//       |a - x| == |b - x| and a < b
//Constraints
//1 <= k <= arr.length
//1 <= arr.length <= 10^4
//arr is sorted in ascending order.
//-10^4 <= arr[i], x <= 10^4
//Sample Input
//6
//10 20 30 40 50 60
//3
//45
//Sample Output
//30 40 50
//Solution:- 

package binarysearch;

import java.util.ArrayList;
import java.util.Collections;


public class closestElement  {
	
	public static ArrayList<Integer> closest (int[]arr, int k , int x){
		int low =0;
		int high =arr.length-1;
		
		
		while(low<=high) {
			int mid = (low+high)/2;               
		   // ArrayList<Integer> is the return type.
		    //after our binary search got over means the search space is overlapped and low > high at that time low will become "h" and high will become "l".
			 //now we are iterating in opposite direction to find the number which are closest to our target although until k==0;
			  //till that we will get the element.
		    	//corner case is that when ever the "h" reaches the last element of array we stop it and continue with "l" only. or vice-versa.
			     //in collection make sure you use capital "C" collection.sort is imported and it is use to return the collection of answers.
			      //forEach is a method introduced in Java 8 that allows you to iterate 
			       //over elements in a collection or stream and perform an action on each element.
			        //It provides a concise way to iterate over collections without needing to use
			          //traditional loops like for or while.
			             // for each method at the end.
			
			if (arr[mid]==x) {
				break;
			}
			else if (arr[mid]<x) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		ArrayList<Integer> solution = new ArrayList<> () ;
		
		int h = low;
		int l = high;
		
		
		while(l>=0 && h < arr.length && k >0 ) {
			
			if(Math.abs(arr[l]-x)<Math.abs(arr[h]-x)) {
				solution.add(arr[l]);
				l--;
			}else {
				solution.add(arr[h]);
				h++;
			}
			k--;
		}
		
		while (l>=0 && k>0) {
			solution.add(arr[l]);
		l--;
		k--;
		}
		
		while (h<arr.length && k>0) {
			solution.add(arr[h]);
		h++;
		k--;
		}
		Collections.sort(solution);
		
		return solution;
	}
	
	public static void main(String[] args) {
		 int[] arr = new int[]{10,20,30,40,50};
	        int target = 45;
	        int k = 3;
	        ArrayList<Integer> output = closest (arr, k, target);
	        output.forEach(System.out::println);
	}  
	
}