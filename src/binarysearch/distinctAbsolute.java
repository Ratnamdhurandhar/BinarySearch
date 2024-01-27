package binarysearch;

public class distinctAbsolute {
	    // Function to calculate absolute value without using Math.abs
	    private static int absoluteValue(int num) {
	        return num >= 0 ? num : -num;
	    }

	    public static int countDistinctAbsoluteValues(int[] arr) {
	        int distinctCount = 0;
	        int n = arr.length;

	        for (int i = 0; i < n; ) {
	            int low = i;
	            int high = n - 1;

	            // Binary search for the last occurrence of the absolute value
	            while (low <= high) {
	                int mid = low + (high - low) / 2;

	                if (absoluteValue(arr[mid]) == absoluteValue(arr[i])) {
	                    high = mid - 1;
	                } else {
	                    low = mid + 1;
	                }
	            }

	            // Increment distinctCount and update the loop variable
	            distinctCount++;
	            i = low;
	        }

	        return distinctCount;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 5, 8, 28};
	        int result = countDistinctAbsoluteValues(array);
	        System.out.println("Number of distinct absolute values: " + result);
	    }
	}

