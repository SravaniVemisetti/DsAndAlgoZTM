package com.ztm.ds.algo;


public class BigOhOfN {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) { //o(n) - linear - no of operations increases as no of elements increases.
		System.out.println(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		//hey
	}

}














