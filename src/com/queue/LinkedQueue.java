package com.queue;

import java.util.NoSuchElementException;

public class LinkedQueue<E> implements QueueADT<E>{

	private int numElements;
	
	private Node<E> frontNode;
	
	private Node<E> rearNode;
	
	
	
	public LinkedQueue() {
		numElements = 0;
		frontNode = null;
		rearNode = null;
	}

	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		
		Node<E> newNode = new Node<E>(element);
		
		if(rearNode == null) {
			frontNode = newNode;
			rearNode = newNode;
		}else {
			rearNode.next = newNode;
			rearNode = newNode;
		}
		numElements++;
		
	}

	@Override
	public E dequeue() throws NoSuchElementException {
		// TODO Auto-generated method stub
	
		if (frontNode != null) {
			E frontElement = frontNode.element;
			frontNode = frontNode.next;
			numElements--;
			if (numElements == 0)
				rearNode = null;
			return frontElement;
		} else
			throw new NoSuchElementException();
		
	}

	@Override
	public E first() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(numElements>0) {
			return frontNode.element;
		}else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numElements==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}
	
	// returns a string representation of the queue from front to rear
	public String toString() {
		String output = "[";
		Node currentNode = frontNode;
		while (currentNode != null) {
			output += currentNode.element;
			if (currentNode.next != null)
				output += ",";
			currentNode = currentNode.next;
		}
		output += "]";
		return output;
	}

	// inner class which represents a node in a singly-linked list
	private class Node<E> {
		public E element;
		public Node<E> next;

		public Node(E element) {
			this.element = element;
			next = null;
		}
	}
}
