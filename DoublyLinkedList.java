package com.data_structure.LinkedList;

class Node {  
	
    int data;  
    Node prev;  
    Node next;  
      
    public Node(int data) {  
        this.data = data;  
    }  
}  

public class DoublyLinkedList {
	
	Node head, tail = null;
	int current_size = 0;

	public boolean isEmpty() { // O(1)  
		return head == null;
	}

	public void add(int data)
	{   	// O(1) 
		Node newNode = new Node(data);
		if (head == null) {
			current_size++;
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		} else {
			current_size++;
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void printNodes() 
	{    // O(N)
		Node current = head;
		if (head == null) {
			return;
		}
		while (current != null) {
			System.out.print(current.data + " <--> ");
			current = current.next;
		}
	}
	
    void reverse()
    {	// O(N)
        Node current = head , pointer = null;
        while (current != null) {
        	pointer = current.prev;
            current.prev = current.next;
            current.next = pointer;
            current = current.prev;
        }
         head = pointer.prev;      
    }
  
	 
    public void sort() 
    {      // O(N^2)
        Node current = head;  
        if(head == null) return;   
        else {   
            while( current.next != null ) {  
            	Node pointer = current.next;
                while( pointer != null) {  
                    if(current.data > pointer.data) {  
                        int temp = current.data;  
                        current.data = pointer.data;  
                        pointer.data = temp;  
                    }  
                    pointer = pointer.next;
                }  
                current = current.next;
            }  
        }  
    }  
     
}
