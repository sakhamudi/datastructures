package com.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<String> animals = new LinkedList();
		 insert(animals);
		 print(animals);
		}
	
	private static void insert(LinkedList<String> animals) {
		animals.add("Dog");
		// add element at the beginning of linked list
		animals.addFirst("Cat");
		// add element at the end of linked list
		animals.addLast("Horse");
	}
	
	private static void print(LinkedList<String> animals) {
		System.out.println("LinkedList: " + animals);
	    // access first element
	    System.out.println("First Element: " + animals.getFirst());
	    // access last element
	    System.out.println("Last Element: " + animals.getLast());
	}
	
	
	
	
	private void delete() {
		
	}

	
}
