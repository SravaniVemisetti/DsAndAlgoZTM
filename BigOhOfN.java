package com.ztm.ds.algo;


public class BigOhOfN {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) { //o(n) - linear - no of operations increases as no of elements increases.
			System.out.println(i);
		}
	}

}
