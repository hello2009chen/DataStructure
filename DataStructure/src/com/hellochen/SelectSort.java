package com.hellochen;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 23, 56, 34, 23, 89 };
		SelectSort selectSort = new SelectSort();
		selectSort.sort(arrays);
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + "\t");
		}
	}
	
	public void sort(int[] arrs) {
		int tmp;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = i + 1; j < arrs.length; j++) {
				if (arrs[i] < arrs[j]) {
					tmp = arrs[i];
					arrs[i] = arrs[j];
					arrs[j] = tmp;
				}
			}
		}
	}
}
