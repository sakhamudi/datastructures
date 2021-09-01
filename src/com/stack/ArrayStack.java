package com.stack;

import java.util.NoSuchElementException;


public class ArrayStack<E> implements StackADT<E> {
	 
	private final int INITIAL_CAPACITY = 20;
	
	protected int numElements;
	
	protected E[] elements;

	public ArrayStack() {
		// TODO Auto-generated constructor stub
		numElements =0;
		elements = (E[]) (new Object[INITIAL_CAPACITY]);
	}
	
	public void push(E element) {
		// TODO Auto-generated method stub
		
		if(numElements>=elements.length) {
			// extend the size 
			extendCapacity();
		}
		elements[numElements] = element;
		numElements++;
		
	}

	private void extendCapacity() {
		// TODO Auto-generated method stub
		
		E[] largeArray = (E[]) (new Object[elements.length*2]);
		for(int i=0;i<numElements;i++) {
			largeArray[i] = elements[i];
		}
		elements = largeArray;
		
	}

	public E pop() throws NoSuchElementException {
		// TODO Auto-generated method stub
		
		if(numElements>0) {
			
			E topElement = elements[numElements-1];
			elements[numElements-1] = null;
			numElements--;
			return topElement;
		}else {
			throw new NoSuchElementException();
		}
		
	}

	@Override
	public E peek() throws NoSuchElementException {
		// TODO Auto-generated method stub
		
		if(numElements>0) {
			return elements[numElements-1];
		}else {
			throw new NoSuchElementException();
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(numElements==0) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	public String toString() {
		String output = "[";
		for (int i = numElements - 1; i >= 0; i--) {
			output += elements[i];
			if (i > 0)
				output += ",";
		}
		output += "]";
		return output;
	}
	
}
