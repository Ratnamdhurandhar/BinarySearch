package binarysearch;

public class pivotElement {
      public static int pivot (int[]arr,int x )
      {
    	  int low=0 ;int high =arr.length-1; int mid;
    	  
    	  while(low<=high) {
    		  mid= (low+high)/2; // formula low+(high-low)/2
    		  if(arr[mid]==x) // agr mid is apna target hua to turant return krdo
    		  { return mid;}
    		  if(arr[low]<=arr[mid]) {     //identify sorted side in this case left side is sorted agr 7 mid h to 
    			  if(arr[low]<=x && x<= arr[mid]) { //phir bhi check kr lete h ki left side me to apna target ni h 
    				  high=mid-1;     // agr h to high aaega left side ni h to low jaega right
    			  }else {low=mid+1;
    		  }
    			  
    	  } else {                                // agr right side sorted h to array ka [6,7,8,9,1,2,3,4,5] iska mid 1 hoga
    		  if(arr[mid]<=x && x<= arr[high]) {  // 6>1 to right side sorted h
    			  low=mid+1;               
    		  }else {
    			  high=mid-1;
    		  }
    	  }
    	  }
    	  return -1;
      }

public static void main(String[] args) {  // [4,5,6,7,8,1,2,3] n=8 target =1
	int[]arr= {4,5,6,7,8,1,2,3};
	int x=3; //target.
	int abc = pivot (arr,x);
	System.out.println(" "+abc);	
}
}


// [4,5,6,7,8,1,2,3] n=8 target =1