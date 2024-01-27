package binarysearch;



import java.util.*;
public class lowerBound

{
	public static int lower (int[]arr,int  n,int x){
		int low=0;   int high=n-1; int ans = x;
		
		while(low<=high) {
	int mid =(low+high)/2;
			if(arr[mid]>= x) {
				ans=mid;
			 high = mid-1;
			}
			else {low=mid+1;
		}
		
	}
		return ans;
}
 
public static void main(String[] args) {
	int[]arr= {3,4,7,9,10,23,25,26};
	int n=8;int x=11;
	int abc = lower (arr,n,x);
	System.out.println(" "+abc);
}
}




































//public class lowerBound {
//
//    public static int lowerBound1 (int []arr, int n, int x) {
//        int low = 0, high = n - 1;
//        int ans = n;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            // low + high /2 kyu ki ye formula h
//            if (arr[mid] >= x) {
//                ans = mid;// ye issliye kyu ki it might be the answer so store it.
//                //look for smaller index on the left
//                high = mid - 1;
//            } else {
//                low = mid + 1; // look on the right
//            }
//        }
//        return ans;
//        
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 8, 15, 19,23,26,29,30};
//        int n = 9, x = 29;
//        int ind = lowerBound1(arr, n, x);
//        System.out.println("The lower bound is the index: " + ind);
//    }
//} 


//Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
//Result: 3