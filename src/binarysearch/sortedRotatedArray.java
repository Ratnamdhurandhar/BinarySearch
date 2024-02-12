package binarysearch;

public class sortedRotatedArray {
	
	    public static boolean search(int[] nums, int target) {
	        int low =0;
	        
	        int x = target;
	       int n = nums.length;
	       int high=n-1;

	       if(nums.length==1 && nums[0]==x) {
        	   
           
          
               return true;
               
        	   } if (nums.length==1 && nums[0] !=x)
        	   {
        		   return false;
        	   }
	       
	        while(low<=high){
	            int mid = (low+high)/2;
	            
	           
	            

		            if(nums[mid]==x)
		                return true;
		            while (nums[low]==nums[high]) {
		            	++low;
		            	--high;
		            }
	            
	            while (nums[low]==nums[mid] && nums[mid]==nums[high])
	            {
	                ++low;
	                --high;
	                
	                
	            }
	            

	            
	             if (nums[low]<=nums[mid]){
	                   if( (nums[low]<=x) && (x<=nums[mid]) ){
	                	   high=mid-1;
	                   }else {
	                       low=mid+1;
	                   }
	                
	            }else{
	               if( (nums[mid]<= x) && (x <= nums[high]) ){
	                   low=mid+1;
	               }else{
	                   high=mid-1;
	               }
	            }
	        } 
	        return false;
	    }
	    
	    
	    public static void main(String[] args) {
	    	int[]nums= {2};
	    	int target=3; //target.
	    	boolean abc = search (nums,target);
	    	System.out.println(" "+abc);	
	    }
		}
	

