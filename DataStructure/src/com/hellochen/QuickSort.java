package com.hellochen;

public class QuickSort {
	

	public static void main(String[] args) {
		
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 23, 56, 34, 23, 89 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arrays, 0, arrays.length - 1);
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + "\t");
		}
	}
	
	public int getMiddle(int[] arrs, int start, int end) {
		int key = arrs[start];
		while (start < end) {
			while (start < end && arrs[end] <= key) 
				end--;
			arrs[start] = arrs[end];
			while (start < end && arrs[start] >= key)
				start++;
			arrs[end] = arrs[start];
		}
		
		arrs[start] = key;
		return start;
	}
	
	public void sort(int[] arrs, int start, int end) {
		if (start < end) {
			int middle = this.getMiddle(arrs, start, end);
			sort(arrs, start, middle - 1);
			sort(arrs, middle + 1, end);
		}
	}
}
