//Question 2
//Second Largest Element
//You have been given an array ‘a’ of ‘n’ unique non-negative integers.
//
//Find the second largest and second smallest element from the array.
//
//Return the two elements (second largest and second smallest) as another array of size 2.
//
//Example :
//Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
//Output: [4, 2]
//
//The second largest element after 5 is 4, and the second smallest element after 1 is 2.
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1 :
//4
//3 4 5 2
//Sample Output 1 :
//4 3
//Explanation For Sample Input 1 :
//The second largest element after 5 is 4 only, and the second smallest element after 2 is 3.
//Sample Input 2 :
//5
//4 5 3 6 7
//Sample Output 2 :
//6 4
//Expected Time Complexity:
//O(n), Where ‘n’ is the size of an input array ‘a’.
//Constraints:
//2 ≤ ‘n’ ≤ 10^5
//0 ≤ ‘a’[i] ≤ 10^9
//
//Time limit: 1 sec
package array;

public class secondLargest {
public static int second (int[]arr) {
int largest = arr[0];
int secondLargest = -1;

for (int i =1; i<arr.length;i++) {
	if(arr[i]>largest) {
		secondLargest=largest;
		largest=arr[i];
	}else if (arr[i]<largest && arr[i]>secondLargest) {
		secondLargest = arr[i];
	}
}
return secondLargest;
}
public static void main(String[] args) {
	int []arr = {1, 9, 3, 1, 17};
	
	int ans = second (arr);
	System.out.println(ans);
}
// t/c O(2n).
}

