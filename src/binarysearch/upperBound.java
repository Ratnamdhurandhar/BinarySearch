package binarysearch;

public class upperBound {

	  public static int upperBound1(int[]arr,int n, int x){
		  int low = 0;
		  int high = n-1;
		  int ans = x;
		  
		  while(low<=high) {
			  int mid=(low+high)/2;
					  if(arr[mid]>x) {
						  ans=mid;
						  high=mid-1;
					  }else {
						  low=mid+1;
					  }
		  }
		  return ans;
	  }
	   public static void main(String[] args) {
		   int[]arr= {2,3,6,7,8,8,11,11,11,12};
			int n=10;int x=6;
			int abc = upperBound1 (arr,n,x);
			System.out.println(" "+abc);
	}
}
