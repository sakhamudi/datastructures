package com.queue;

public class LinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedQueue<String> queue = new LinkedQueue<String>();

		queue.enqueue("praveen");
		queue.enqueue("kumar");
		queue.enqueue("sakhamudi");
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());

	}

}
