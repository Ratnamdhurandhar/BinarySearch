package binarysearch;

public class minimumDifference {
    public static int minimum(int[]arr, int x) {
    	int low=0;
    	int high=arr.length-1;;
    	int mid=0;                 //necessary to initialize outside the loop. because we are returning it at the end.
    	
    	while(low<=high) {
    		mid= (low+high)/2;
    		if (arr[mid]==x) {
    			return arr[mid];   //agar mid target se chota h to right side search krega ni to left
    		}
    		if(arr[mid]<x) {
    			low=mid+1;
    		}else {
    			high=mid-1;
    		}
    	}
    return arr[mid];	
    }
    
    
    
    
    public static void main(String[] args) {


	int[]arr= {2,5,10,12,15};
	int x=5; //target.
	int abc = minimum (arr,x);
	System.out.println(" "+abc);
	}
}
