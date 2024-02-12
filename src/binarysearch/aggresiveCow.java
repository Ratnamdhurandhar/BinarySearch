//Problem statement
//You are given an array 'arr' consisting of 'n' integers which denote the position of a stall.
//
//
//
//You are also given an integer 'k' which denotes the number of aggressive cows.
//
//
//
//You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.
//
//
//
//Print the maximum possible minimum distance.
//
//
//
//Example:
//Input: 'n' = 3, 'k' = 2 and 'arr' = {1, 2, 3}
//
//Output: 2
//
//Explanation: The maximum possible minimum distance will be 2 when 2 cows are placed at positions {1, 3}. Here distance between cows is 2.
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1 :
//6 4
//0 3 4 7 10 9
//
//
//Sample Output 1 :
//3
//
//
//Explanation to Sample Input 1 :
//The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}. Here distance between cows are 3, 4 and 3 respectively.
//
//
//Sample Input 2 :
//5 2
//4 2 1 3 6
//
//
//Sample Output 2 :
//5
//
//
//Expected time complexity:
//Can you solve this in O(n * log(n)) time complexity?
//
//
//Constraints :
//2 <= 'n' <= 10 ^ 5
//2 <= 'k' <= n
//0 <= 'arr[i]' <= 10 ^ 9
//Time Limit: 1 sec.











package binarysearch;

import java.util.Arrays;

public class aggresiveCow {
public static void main(String[] args) {
	int []arr= {0, 3, 4, 7 ,10, 9};
	int k =4;
	
	int ans1 = minimumspace (arr,k);
	System.out.println(ans1);
}




	public static boolean counts(int[]arr,int dist , int k){
		int startPoint = arr[0];                                 //always place first cow on the 0th index
		int count =1;
		
		for (int i =0;i<arr.length;i++) {
			if (Math.abs(arr[i]-startPoint)>= dist) {
				count++;
				startPoint= arr[i];
			}
			if (k == count) {
				return true;
			}
				
		
			}
		return false;
		
	}
	
	public static int minimumspace (int[]arr,int k) {
		Arrays.sort(arr);                                   //sorting the array
		int n = arr.length;
		int low = 0;
		int high = Math.abs(arr[n-1]-arr[0]);
		
		while (low<=high) {
			int mid = (low+high)/2;

			
			if (counts(arr,mid,k)==true) {
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return high;             //high will point towards the desired result as we wanted the minimum value.
	}
	
	
}
