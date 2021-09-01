package com.stack;

public class StackArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStack<String> data = new ArrayStack<String>();

		data.push("praveen");
		data.push("kumar");
		data.push("sakhamudi");
		data.push("preksha");

		System.out.println(data);

		data.pop();

		System.out.println(data);
		data.pop();

		System.out.println(data);
	}

}
