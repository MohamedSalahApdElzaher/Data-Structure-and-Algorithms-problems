package com.data_structure.Stack;

public class StackApp {

	public static void main(String[] args) {
		// Test StakArray class
		StackArray st = new StackArray(3);
		st.push(1);
		st.push(2);
		st.push(3);
		
		while(! st.isEmpty()) {
			System.out.println(st.pop());
		}

		// Test Stak_LinkedList class
		Stack_LinkedList list = new Stack_LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		
		while(! list.isEmpty()) {
			System.out.println(list.pop());
		}
		
	}

}
