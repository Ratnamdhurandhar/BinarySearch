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
				else {low=mid+1;
			}
			
		}
			return ans;
	}
	 
	public static void main(String[] args) {
		int[]arr= {2,5,10,12,15};
		int n=5;int x=11;
		int abc = search (arr,n,x);
		System.out.println(" "+abc);
	}
	}

