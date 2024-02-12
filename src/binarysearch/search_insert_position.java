package binarysearch;

public class search_insert_position {
	

	
		public static int search (int[]arr,int  n,int x){
			int low=0;   int high=arr.length-1; int ans = x;
			
			while(low<=high) {
		int mid =(low+high)/2;
				if(arr[mid]>= x) {
					ans=mid;
				 high = mid-1;
				}
				else {
					low=mid+1;
			}
			
		}
			if(low>high) {
				return low;
			}
			return ans;
	}
	 
	public static void main(String[] args) {
		int[]arr= {1,3,5,6};
		int n=4;int x=9;
		int abc = search (arr,n,x);
		System.out.println(" "+abc);
	}
	}

