package com.data_structure.LinkedList;

// hold all linkedList operations

public class LinkedList {
	
	public Node head , last;
	public int data;
	int current_size=0;
	
	// IsEmpty ?
	public boolean isEmpty() { // O(1)
		return head == null;
	}
	
	// insert at first
	public void insertFirst(Node newNode) { // O(1)
		if(isEmpty()) {
			head=last=newNode;
			current_size++;
		}else {
			newNode.next = head;
			head = newNode;
			current_size++;
		}
	}
	
	// insert at last
	public void insertLast(Node newNode) { // O(1)
		// if Empty List
		if(isEmpty()) insertFirst(newNode);
		else{
			last.next = newNode;
			last = newNode;
			current_size++;
		}
	
	}
	
	// insert at specific position
	void InsertNth( int data, int position) {
	    int count = 0;
	    Node current = head;
	    Node prev = null;
	    while(count != position){
	      count++;
	      prev = current;
	      current = current.next;
	    }

	    Node newNode = new Node(data);

	    newNode.next = current;
	    if(count == 0){
	    	head = newNode;
	       }else{
	          prev.next = newNode;
	    }
          
	}
	
	// delete First
	public void deleteFirst() { // O(1)
			head = head.next;
			current_size--;
	}
	
	// delete Last
	public void deleteLast() { // O(n)
	    if(head == last) {
	    	deleteFirst();
	    }
		else {
			Node current = head , previous = null;
			while(current!=last) {
				previous=current;
				current=current.next;
			}
			previous.next=null;
			last = previous;
			current_size--;
		}
	}
	
	// delete at position
	 Node deleteNodeAtPosition(int position) {
   
          if(position == 0) {
        	  head = head.next;
        	  return head;
          }
          else
          {
        	     int x = 0;
        	     Node current = head , previous = null;
                 while(x != position){
                   previous = current;
                   current = current.next;
                   x++;
                 }

                 previous.next = current.next;
                 return head; 
          }
     
      }
	
	// traverse Linked List
	public void Traverse() { // O(n)
		Node current = head;
		System.out.print("head --> ");
		while(current!=null) {
			System.out.print("|"+current.data+"| --> ");
			current = current.next;
		}
		System.out.println("Null");
	}
	
	// Search Linked List
	public boolean Search(int key) { // O(n)
		Node current = head;
		while(current!=null) {
			if( key == current.data) return true;
			current = current.next;
		}
		return false;
	}
	
	// Get List Size
	public int getSize() { // O(1)
		return current_size;
	}

	// sort Linked List
	void sortList() { // O(n^2)
		Node current = head , iterator = null;
		int temp;
		while(current!=null) { 
			iterator = current.next;
				while (iterator!=null) {
					if(current.data > iterator.data) {
						temp = current.data;
						current.data = iterator.data;
						iterator.data = temp;
					}
					
					iterator = iterator.next;
				}
			current = current.next;
		}
	}

	// merge Linked List
	void Merge(LinkedList list1 , LinkedList list2) {
		Node current = list1.head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = list2.head;
	}
	
	
	// get mid node
		private Node getMid(Node n) {
			if(n==null)return n;
			// midNode move one node at time
			// NextNode move 2 nodes at time
			Node midNode = n ,  NextNode = n;
			while(NextNode.next != null && NextNode.next.next!=null) {
				midNode = midNode.next;
				NextNode = NextNode.next.next;
			}
			return midNode;
		}
	
	// merge sort
	public Node mergeSort(Node n) {
		if(n == null || n.next == null)return n;
		Node midNode = getMid(n); // get mid node
		Node MidNextNode = midNode.next; // next node to mid (second half)
		midNode.next=null;
		Node l = mergeSort(n); // divide first half 
		Node h = mergeSort(MidNextNode); // divide second half
		Node sortedList = merge(l,h); // merge final nodes
		return sortedList;
	}

	// merge 2 nodes
	private Node merge(Node l, Node h) {
		Node res = null;
       // if found one node , return it	
		if(l == null)return h;
		if(h == null)return l;
		// compare data of final 2 nodes
		if(l.data < h.data) {
			res = l;
			res.next = merge(l.next, h); // move res pointer and first half pointer
		}
		else {
			res = h;
			res.next = merge(l, h.next);// move res pointer and second half pointer
		}
		
		return res; // final node contains appended nodes
	}

}
