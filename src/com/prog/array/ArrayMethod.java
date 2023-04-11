package com.prog.array;

public class ArrayMethod {

	public static void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				{
					min = arr[i];
					System.out.println(arr[i]);
				}

			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 0, 33, 100, 24, 5, 1, -1 };
		min(a);

	}

}
