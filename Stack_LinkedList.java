package com.data_structure.Stack;

import java.util.*;

// implement Stack using LinkedList

public class Stack_LinkedList {

	LinkedList <Integer> list = new LinkedList<>();
	int top;
	
	Stack_LinkedList(){
		top=-1;
	}
	
	// isEmpty
	boolean isEmpty() {
		return top == -1;
	}
	
	// push
	void push(int data) {
		++top;
		list.addFirst(data);
	}
	
	// pop
	int pop() {
		top--;
		return list.removeFirst();
	}
	
	// peak
		int peak() {
			return list.removeFirst();
		}
	
	 // isFull
		boolean isFull() {
              return top == list.size()-1;
		}

}
