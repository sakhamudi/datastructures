package com.thread;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultipleCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("-----------Started ---------------");
		Counter counterA = new Counter(10, "A");
		Counter counterB = new Counter(10, "B");
		Counter counterC = new Counter(10, "C");
		
		Thread threadA = new Thread(counterA);
		Thread threadB = new Thread(counterB);
		Thread threadC = new Thread(counterC);
		
		threadA.start();
		threadB.start();
		threadC.start();
		System.out.print("-----------End ---------------");
		
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
	}

}
