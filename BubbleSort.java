package com.algorithms.sorts;

import java.util.Arrays;

public class BubbleSort {
	
	public static int [] bubbleSort(int a[]) { // O(N^2)
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j-1] > a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = bubbleSort(new int [] {55,1,20,2,15,12,24});
		System.out.println(Arrays.toString(a));
	}
	

}
