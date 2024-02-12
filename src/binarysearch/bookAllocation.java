package binarysearch;

import java.util.Arrays;

//1. You are given N number of books. Every book has a number of pages.
////2. You have to allocate books to M number of students. 
//There can be many ways or permutations to do so. In each permutation, 
//one of the M students will be allocated the maximum number of pages. Out of all these permutations,
//the task is to find that particular permutation in which the maximum number of pages allocated to a student is the minimum of
//those in all the other permutations and print this minimum value.
//3. Each book will be allocated to exactly one student. Each student has to be allocated at least one book.
//4. Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order.
//Constraints
//1 <= N <= 10^5
//1 <= A [ i ] <= 10^6
//1 <= M <= 10^5
//Sample Input
//4 number of books
//12 30 48 10
//2 number of students                       hence one will take 42 and another will take 58
//Sample Output :-
//
//58


public class bookAllocation {
	
	public static int pages (int[]arr,int pages) {
		int totalPages=0;                                        //this is the function
		//student is where we are storing our student count.
		int students =1;
		for (int i =0 ; i< arr.length; i++){
			if (arr[i]+totalPages <= pages) {   // {25,46,28,49,24} first 25 is coming 25+0()totalPages <= pages(mid)  let suppose mid is 110.
				totalPages+=arr[i];               //25<110 now arr[1] =46 . 46+25 = 71 which is also < than 110 . this lop will run till the sum is greater than
			}else {                                 //110.
				students++;                           //after that student count will increase . and the totalpages count will be start with next
				                                      // element of array
				                                 
				totalPages=arr[i];
			}
		}
		return students;                            //this will return student count
	}
	
	
	
  public static int book(int[]arr,int m , int n){
	  int low = 0;                           //search space is between 49 to 172
	  int high = Arrays.stream(arr).sum();
	   // first we check for exceptional cases like what if the no. of students is more than of books then we have to return -1;
	  if (m>arr.length) {
			return -1;                                            
	  }
	  
	  while(low<=high) {                       
		  int mid = (low+high)/2;
		  
		  int students = pages (arr,mid);
		  
		  if (students <= m) {        //for < we will get 73 but for <= will get 71
			                      //at above example of 110 we get student count as 2 we wanted it for 4 so mid -1 =high
			  high=mid-1;
		  }else {
			  low=mid+1;                                 
		  }
	  }
	  return low;
   }                                     //low will point to the minimum of the maximum value of pages a student can carry.
 
  public static void main(String[] args) {
	int []arr = {25,46,28,49,24};
	int m=4;
	int n=5;
	int ans1 = book(arr,m,n);
	System.out.println(ans1);
  
  

}
}
