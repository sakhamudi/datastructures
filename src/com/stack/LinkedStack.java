package com.stack;

import java.util.NoSuchElementException;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

public class LinkedStack<E> implements StackADT<E> {

	protected int numElements;
	protected Node<E> firstNode;

	public LinkedStack() {
		numElements = 0;
		firstNode = null;
	}

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub

		Node<E> newNode = new Node<>(element);
		newNode.next = firstNode;
		firstNode = newNode;
		numElements++;

	}

	@Override
	public E pop() throws NoSuchElementException {
		// TODO Auto-generated method stub
		
		if(firstNode!=null) {
			E topElement = firstNode.element;
			firstNode = firstNode.next;
			numElements--;
			return topElement;
		}
		 throw new NoSuchElementException();
	}

	@Override
	public E peek() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(numElements>0) {
			return firstNode.element;
		}else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numElements>0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}
	
	

	@Override
	public String toString() {
		String output = "[";
		Node currentNode = firstNode;
		while (currentNode != null) {
			output = output+  currentNode.element;
			if (currentNode.next != null)
				output = output + ",";
			currentNode = currentNode.next;
		}
		output += "]";
		return output;
	}



	protected class Node<E> {
		public E element;
		public Node<E> next;

		public Node(E element) {
			this.element = element;
			next = null;
		}
	}

}
