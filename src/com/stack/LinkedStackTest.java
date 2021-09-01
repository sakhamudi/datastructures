package com.stack;

public class LinkedStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedStack<String> stack = new LinkedStack<String>();
		
		stack.push("praveen");
		stack.push("kumar");
		stack.push("sakhamudi");
	
		System.out.println(stack.toString());
		
	}

}
