package com.algorithms.sorts;

import java.util.Arrays;

public class ShellSort {
	
	private static int [] Sort(int a[]) {
		int n = a.length;
		// take a gap = n/2
		for(int gap = n/2;gap>=1; gap/=2) {
			for (int j = gap; j<n; j++) {
				for (int i = j-gap; i >=0 ; i-=gap) {
					if(a[i+gap] > a[i])break;
					else {
						int temp = a[i+gap];
						a[i+gap] = a[i];
						a[i]=temp;
					}
				}
			}
		}
		return a;
	}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Sort(new int [] {8,4,6,7,3,10,1,15,20,100,0})));

	}

}
