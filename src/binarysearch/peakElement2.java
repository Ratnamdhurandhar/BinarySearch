package binarysearch;

//
//Given an array of integers. Find a peak element in it. An array element is a peak 
//if it is NOT smaller than its neighbors. For corner elements, we need to consider only one neighbor. 
//Example:
//Input: array[]= {5, 10, 20, 15}
//Output: 20
//The element 20 has neighbors 10 and 15,
//Both of them are less than 20.
//
//Input: array[] = -infi{10, 20, 15, 2, 23, 90, 670}-in
//Output: 20 or 90
//The element 20 has neighbors 10 and 15, 
//both of them are less than 20, similarly 90 has neighbors 23 and 67.
//Following corner cases give a better idea about the problem. 
//If the input array is sorted in strictly increasing order, the last element is always a peak element.
//For example, 50 is the peak element in {10, 20, 30, 40, 50}.
//If the input array is sorted in strictly decreasing order, the first element is always a peak element. 
//100 is the peak element in {100, 80, 60, 50, 20}.
//If all elements of the input array are the same, every element is a peak element.


public class peakElement2 {
	
	
	 public static int peakElement(int[]arr, int n) {
     	int low=1;
     	int high=n-2;
     	
     	
     	if(n==1) {
     		return arr[0];   //if arr[9] like this with 1 element  for that case
     	}
     	if(arr[0]>arr[1]) {   // if element first is peak element
     		return arr[0];
     	}
     	if(arr[n-1]>arr[n-2]) { //if element last is peak element
     		return arr[n-1];
     	}
     	while(low<=high) {
     		int mid= (low+high)/2;
     		if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {  //pehle mid ke liye check lagao ki wo to peak ni h by comparing it with its neighbours.
     			return arr[mid];
     		}
     		if(arr[mid]>arr[mid-1]) {           //agr mid ke pehle wala chota h to increase ho rh array in this case peak mid ke right me hoga
     			low=mid+1;   
     		}else
     		{
     			high=mid-1;    //agr mid ke pehle wala bada h to decrease ho rh array in this case peak mid ke left me hoga
     		}
     	}
     	return -1;             // function wants an integer return it doesnt rely on conditional returns although condition will work in any situation in this case.
     }
     
     public static void main(String[] args) {
			int []arr= {10, 20, 15, 2, 23, 90, 670};
			int n=7;
			int abc = peakElement(arr,n);
			System.out.println(abc);
		}


}
