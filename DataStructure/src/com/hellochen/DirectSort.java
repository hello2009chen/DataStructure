package com.hellochen;

public class DirectSort {

	public static void main(String[] args) {
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 23, 56, 34, 23, 89 };
		DirectSort directSort = new DirectSort();
		directSort.sort(arrays);
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + "\t");
		}
	}
	
	
	public void sort(int[] arrs) {
		
		for (int i = 1; i < arrs.length; i++) {
			int index = i - 1;
			int tmp = arrs[i];
			while (index >=0 && arrs[index] > tmp) {
				arrs[index+1] = arrs[index]; 
				index--;
			}
			arrs[index+1] = tmp;
		}
		
	}
	
}
