package com.thread;

public class Counter implements Runnable {

	private int maxCount;
	private String name;

	public Counter(int maxCount, String name) {
		this.maxCount = maxCount;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < maxCount; i++) {
			System.out.print("Counter " + name + " is " + i + ", ");
			System.out.println("Counter " + name + " about to loop");
		}

	}

}
