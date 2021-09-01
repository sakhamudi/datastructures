package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] keys = {"1","2","3"};
		int[] arr = {1,2,3};
		
		int result = map(2,keys , arr, "4");
		System.out.println("Result ::"+result);
	}

	 static int map(int n, String keys[], int arr[], String s)
	    {
	        // code here
	        Map<String,Integer> data =  new HashMap<>();
	        for(int i=0;i<n;i++){
	            data.put(keys[i],new Integer(arr[i]));
	        }
	        Set<String> keySet = data.keySet();
	      //  HashSet<String> s;
	        if(keySet.contains(s)) {
	        	return data.get(s);
	        }
	        return 0;
	        
	    }
}
