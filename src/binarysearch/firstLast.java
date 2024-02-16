package binarysearch;

public class firstLast {
public static int first (int[]arr,int target) {
	int low =0;
	int high=arr.length-1;
    int first =-1;
    int x = target;
	
	while(low<=high) {
		int mid = (low+high)/2;
		if (arr[mid]==x) {
			first =mid;
			high =mid-1;
		}
		
		if (arr[mid]<x) {
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	return first;
}

public static int last (int[]arr,int target) {
	int low =0;
	int high=arr.length-1;
    int last=0 ;
    int x = target;
	
	while(low<=high) {
		int mid = (low+high)/2;
		if (arr[mid]==x) {
			last =mid;
			low=mid+1;
		}
		
		else if (arr[mid]<x) {
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	return last;
}

	 public static void main(String[] args) {
		   int[]arr= {5,7,7,8,8,10};
			int x=8;
			int abc = first(arr,x);
			int abc1 = last(arr,x);
			System.out.println(" "+abc+" "+abc1);
	
}

}
