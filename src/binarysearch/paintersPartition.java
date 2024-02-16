package binarysearch;
import java.util.Arrays;

//Problem Statement :-
//
//Given an array/list of length ‘n’, where the array/list represents the boards and 
//each element of the given array/list represents the length of each board. Some ‘k’ numbers 
//of painters are available to paint these boards. Consider that each unit of a board takes 1 unit
//of time to paint.
//
//You are supposed to return the area of the minimum time to get this job done of 
//		painting all the ‘n’ boards under a constraint that any painter will only 
//		paint the continuous sections of boards.
//
//Example :
//Input: arr = [2, 1, 5, 6, 2, 3], k = 2
//
//Output: 11
//
//Explanation:
//First painter can paint boards 1 to 3 in 8 units of time and the second painter 
//can paint boards 4-6 in 11 units of time. Thus both painters will paint all the 
//boards in max(8,11) = 11 units of time. It can be shown that all the boards can’t be
//painted in less than 11 units of time.package binarysearch;

public class paintersPartition {

	public static int walls (int[]arr, int painters) {
		int totalTime=0;
		int block = 1;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]+totalTime <= painters) {
				totalTime +=arr[i];
			}else
			{
				block++;
				totalTime=arr[i];
			}
		}
		return block;
	}
	
	public static int binary (int []arr, int k) {
		int low = 0;                           
		  int high = Arrays.stream(arr).sum();
		  
		  while(low<=high) {                       
			  int mid = (low+high)/2;
			  
			  int block = walls(arr,mid);
			  
			  if (block <= k) {       
				  high=mid-1;
			  }else {
				  low=mid+1;                                 
			  }
		  }
		  return low;
	   }            
	
public static void main(String[] args) {
	int []arr = {2, 1, 5, 6, 2, 3};
	int k=2;
//	int n=6;
	int ans1 = binary(arr,k);
	System.out.println(ans1);



}
}
