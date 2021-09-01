package com.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,6,1,4,0,9,90,8,-1};
		
		selectionSort(a);
		
		for(int num:a) {
			System.out.print(num +" ");
		}

	}
	
	static int  findMinIndex(int a[],int start) {
		
		int minIndex = start;
		
		++start;
		
		while(start<a.length) {
			
			if(a[start]<a[minIndex])
				minIndex = start;
			
			++start;
		}
		
		return minIndex;
		
	}
	
	public static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void selectionSort(int a[]){
		
		// find minimum index
		
		// swaping 
		for(int i = 0; i < a.length; ++i) {  
            int min_index = findMinIndex(a, i);  
  
            if(i != min_index)  
                swap(a, i, min_index);  
        }  
		
	}

	
	
}
