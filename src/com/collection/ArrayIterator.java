package com.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {

	private int numElements; // number of elements in array to use
	private E[] elements; // the array to use
	private int nextIndex; // index of next element for the iterator
// constructor which accepts an array of elements
// and prepares an iterator which will iterate through the
// first numElements elements of the array

	public ArrayIterator(E[] elements, int numElements) {
		if (numElements > elements.length)
			numElements = elements.length;
		this.numElements = numElements;
		this.elements = elements;
		nextIndex = 0; // start with index of first element in array
	}

// returns whether there is still another element
	public boolean hasNext() {
		return (nextIndex < numElements);
	}

// returns the next element or throws a NoSuchElementException
// it there are no further elements
	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new NoSuchElementException();
		return elements[nextIndex++];
	}

// remove method not supported by this iterator
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

}
