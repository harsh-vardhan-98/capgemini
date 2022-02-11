package com.company;


class MaxMinFinder{
	int []arr;
	int returnArr[] = {0,0};
	
	MaxMinFinder(int arr[] ){
		this.arr = arr;
	}
	
	
	
	int min() {
		int min = arr[0];
		for (int i = 0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	int max() {
		int max = 0;
		for (int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	

	
}


public class Assignemnt2 {
	
	
	public static void main(String[] args) {
		int arr[] = {2,4,1,5,10};
		MaxMinFinder m = new MaxMinFinder(arr);
		System.out.println(m.min());
		System.out.println(m.max());

	}



}
