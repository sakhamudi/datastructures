package com.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12,11,13,5,6};
	    sort(arr);	
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		
		for(int i:arr) {
			System.out.print(i +" ");
		}
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
	

		// TODO Auto-generated method stub
		
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int key = arr[i];
			
			int j = i-1;
			
			/* 
			 * 10  11  8  9  15 90 
			 * Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] =  key;
		}
		
	
	}
	
	

}
