package com.data_structure.Stack;

// implement Stack using array

public class StackArray {

	int top, size;
	int arr [] ;
	
	public StackArray(int size) {
		top = -1;
		this.size = size;
		arr = new int[this.size];
	}
	
	// isEmpty
	boolean isEmpty() {
		return top == -1;
	}
	
	// push
	void push(int data) {
		arr[++top] = data;
	}
	
	// pop
	int pop() {
		return arr[top--];
	}
	
	// peak
		int peak() {
			return arr[top];
		}
	
	 // isFull
		boolean isFull() {
			return top == arr.length-1;
		}

}
