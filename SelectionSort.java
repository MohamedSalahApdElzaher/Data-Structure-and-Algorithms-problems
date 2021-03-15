package com.algorithms.sorts;

import java.util.Arrays;
import java.util.Iterator;

public class SelectionSort {
	
	public static int[] selectionSort(int a[]) { // O(N^2)
		for (int i = 0; i < a.length; i++) {
			int min = i; // minmum index
			for (int j = i+1 ; j < a.length; j++) {
				 if(a[j] < a[min]) min = j;
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
 
	public static void main(String[] args) {
		int a[] = selectionSort(new int [] {55,1,20,2,18,50,15,12,24});
		System.out.println(Arrays.toString(a));
	}

}
