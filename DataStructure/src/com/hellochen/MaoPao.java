package com.hellochen;

public class MaoPao {
	
	public static void main(String[] args) {
		int[] arrays = new int[]{10,90,23,34,45,23,56,34,23,89};
		MaoPao mp = new MaoPao();
		mp.sort(arrays);
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + "\t");
		}
	}
	
	
	public void sort(int[] arrs) {
		int tmp;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length - i - 1; j ++) {
				if (arrs[j] > arrs[j+1]) {
					tmp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = tmp;
				}
			}
		}
	}
}
