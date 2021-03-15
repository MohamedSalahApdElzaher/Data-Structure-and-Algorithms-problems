package com.algorithms.sorts;

import java.util.Arrays;

public class Quick_Sort {
	
	public static void main(String[] args) {
		int a[] =  {8,4,6,7,3,10,1,15,20,100,0};
		System.out.println("before sort");
		System.out.println(Arrays.toString(a));

		QuickSort(a, 0, a.length-1);
		System.out.println("after sort");

		System.out.println(Arrays.toString(a));
		
	}
	
	// partition method
	static int partition(int a[],int start,int end) {
		int pivote = a[end];
		int index = start;
		for(int i=start;i<=end-1;i++) {
			if(a[i] <= pivote) {
				int temp = a[i];
				a[i] = a[index];
				a[index]=temp;
				index++;
			}
		}
		
		int temp = a[index];
		a[index] = a[end];
		a[end]=temp;
		
		return index;
	}
	
	static void QuickSort(int a[],int start,int end) {
		if(start >= end)return;
		int i = partition(a, start, end);
		QuickSort(a, start, i-1);
		QuickSort(a, i+1, end);
	}

}
