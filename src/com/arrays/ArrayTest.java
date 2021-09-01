package com.arrays;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[5];
		insert(data);
        display(data);
	}

	public static void insert(int data[]) {
		Random rand = new Random();

		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt();
		}
	}
	
	public static void display(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
