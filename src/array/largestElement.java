//Question 1
//Largest Element

//Given an array ‘arr’ of size ‘n’ find the largest element in the array.
//
//Example:
//
//Input: ‘n’ = 5, ‘arr’ = [1, 2, 3, 4, 5]
//
//Output: 5
//
//Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
//
//Sample input 1:
//6
//4 7 8 6 7 6
//Sample output 1:
//8
//Explanation of sample input 1:
//The answer is 8.
//From {4 7 8 6 7 6}, 8 is the largest element.
//Sample input 2:
//8
//5 9 3 4 8 4 3 10
//Sample output 2:
//10
//Expected Time Complexity:
//O(n), Where ‘n’ is the size of an input array ‘arr’.
//Constraints :
//1 <= ‘n’ <= 10^5
//1 <= ‘arr[i]’ <= 10^9
//
//Time Limit: 1 sec
package array;

public class largestElement {
public static int largestElement1 (int[]arr) {
int largest = arr[0];
 int n= arr.length;
for (int i =0; i<n; i++) {
	if (arr[i] > largest) {
		largest = arr[i];
	}
}
return largest;
}
public static void main(String[] args) {
	int []arr = {9000, 90, 3000, 9, 5};
			
			int ans = largestElement1 (arr);
			System.out.println(ans);
}

}
