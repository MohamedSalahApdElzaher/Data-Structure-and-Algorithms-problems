package com.algorithms.sorts;
/*
import java.util.Arrays;

import com.data_structure.LinkedList.LinkedList;
import com.data_structure.LinkedList.Node;


public class MergeSort {
	
	// merge Sort Array class
	public class MergeSortArray{
		
		private void mergeSort(int unsorted[], int lowerBound , int upperBound) {
			// base condition
			int sorted [] = new int[unsorted.length];
			if(lowerBound == upperBound)return;
			else {
				int mid = ( lowerBound + upperBound ) / 2 ;
				mergeSort(unsorted, lowerBound, mid); // first half
				mergeSort(unsorted, mid+1, upperBound); // second half

				merge(unsorted ,sorted, lowerBound , mid+1 , upperBound);
			}
		}
		
		void merge(int unsorted[]  , int sorted [] , int lowptr , int highptr , int upperBound){
			
			int j = 0 , lowerBound = lowptr , mid = highptr-1 , n = upperBound-lowerBound+1;
			
			while(lowptr <= mid && highptr <= upperBound) 
				if(unsorted[lowptr] < unsorted[highptr]) sorted[j++] = unsorted[lowptr++];
				else sorted[j++] = unsorted[highptr++];
			
			while(lowptr <= mid ) sorted[j++] = unsorted[lowptr++];
			while(highptr <= upperBound ) sorted[j++] = unsorted[highptr++];
			
			for( j=0;j<n;j++) unsorted[lowerBound+j] = sorted[j];

			
		}
		
		
		// merge method Big O (N)
		private void merge2SortedArray(int a[] , int b[] , int c[]) {
			int a_i =0, b_i=0,c_i=0;
			while(a_i < a.length && b_i < b.length) {
				if(a[a_i] < b[b_i]) c[c_i++] = a[a_i++];
				else c[c_i++] = b[b_i++];
			}
			while(a_i < a.length)c[c_i++] = a[a_i++];
			while( b_i < b.length)c[c_i++] = b[b_i++];	
		}
	}
		
	// test MergeSortArray class
	private static void mergeArrTest() {
		int unsort [] = {5,4,1,9,7,30,25,100,101,75};
		int sort [] = new int [unsort.length];
	    System.out.println(Arrays.toString(unsort));
		new MergeSort().new MergeSortArray().mergeSort(unsort,0,sort.length-1);
        System.out.println( Arrays.toString(unsort));
	}
	
	
	// main
	public static void main(String[] args) {

		//mergeListTest();
		
		
		 mergeArrTest();
	
	}


	
	// merge sort LinkedList class
	public class mergeSortLinkedList{
		
	
		
		
		
		
		 // merge merge2SortedLinkedList method Big O (N)
			private void merge2SortedLinkedList(LinkedList l1 , LinkedList l2 , LinkedList l3) {
				
				Node head_1 = l1.head;
				Node head_2 = l2.head;
				
				while(head_1 != null && head_2 != null) {
					if(head_1.data < head_2.data) {
						l3.insertLast(head_1);
						head_1 = head_1.next;
					}
					else {
						l3.insertLast(head_2);
						head_2 = head_2.next;
					}
				}
				
				while(head_1 != null) {
					l3.insertLast(head_1);
					head_1 = head_1.next;
				}
				
				while(head_2 != null) {
					l3.insertLast(head_2);
					head_2 = head_2.next;
				}

				
				
			}

	}

	// test mergeSortLinkedList class
	private static void mergeListTest() {
		
		LinkedList list_1 = new LinkedList();
		list_1.insertLast(new Node(5));
		list_1.insertLast(new Node(7));
		
		LinkedList list_2 = new LinkedList();
		list_2.insertLast(new Node(10));
		list_2.insertLast(new Node(15));
		list_2.insertLast(new Node(30));

		LinkedList list_3 = new LinkedList();

		new MergeSort().new mergeSortLinkedList().merge2SortedLinkedList(list_1,list_2,list_3);
		list_3.Traverse();
	}


}
*/