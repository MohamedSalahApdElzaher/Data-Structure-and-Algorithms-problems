package com.data_structure.LinkedList;

	
class LinkedListApp {
	

	public static void main(String[] args) {
		
		DoublyLinkedList l = new DoublyLinkedList();
		
		l.add(50);
		l.add(100);
		l.add(30);
		l.add(10);
		l.add(70);
		
		 l.printNodes();
		 System.out.println();
	    l.reverse();
	    l.printNodes();
	}
}
