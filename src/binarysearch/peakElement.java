package binarysearch;

public class peakElement {
            public static int peak(int[]arr, int n) {
            	int low=1;
            	int high=n-2;
            	
            	
            	if(n==1) {
            		return arr[0];
            	}
            	if(arr[0]>arr[1]) {
            		return arr[0];
            	}
            	if(arr[n-1]>arr[n-2]) {
            		return arr[n-1];
            	}
            	while(low<=high) {
            		int mid= (low+high)/2;
            		if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
            			return arr[mid];
            		}
            		if(arr[mid]>arr[mid-1]) {
            			low=mid+1;
            		}else
            		{
            			high=mid-1;
            		}
            	}
            	return -1;
            }
            
            public static void main(String[] args) {
				int []arr= {1,2,3,4,5,6,7,8,5,1};
				int n=10;
				int abc = peak(arr,n);
				System.out.println(abc);
			}
}
