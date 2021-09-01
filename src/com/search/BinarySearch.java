package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 4, 6, 10, 40 };

		int length = arr.length;
		int x = 2;
		int result = binarySearch(arr, 0, length - 1, x);
       
		if (result == -1) {
			System.out.println("Element not found ");
		} else {
			System.out.println("Element found ");
		}

	}

	public static int binarySearch(int arr[], int left, int right, int target) {

		if (right >= 1) {

			int mid = (left + right) / 2;
			System.out.println(" left::: " +left +" right:: "+right +" mid::"  + mid);

			if (arr[mid] == target) {
				return mid;
			}
			// if element is smaller then mid , then
			// it can be present in left sub array
			else if (arr[mid] > target) {
				return binarySearch(arr, left, mid - 1, target);
			}

			else if (arr[mid] < target) {
				return binarySearch(arr, mid + 1, right, target);
			}

		}

		return -1;
	}

}
