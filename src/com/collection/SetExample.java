package com.collection;

import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> bootTitle = new ArraySet();
		
		bootTitle.add("java");
		bootTitle.add("j2ee");
		bootTitle.add("springs");
		bootTitle.add("java");
		System.out.println("Data ::"+bootTitle);
		bootTitle.remove("java");
		System.out.println("Data ::"+bootTitle);
		
		ArrayIterator<String> ite = (ArrayIterator<String>) bootTitle.iterator();
		
		if(ite.hasNext()) {
			System.out.println("Data ::::::::"+ite.next());
		}
		
		
	}

}
