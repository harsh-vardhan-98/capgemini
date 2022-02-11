package com.company;


class MinMaxFinder{
	int []arr;
	int returnArr[] = {0,0};
	
	MinMaxFinder(int arr[] ){
		this.arr = arr;
	}
	
	int []  minMax() {
		int max = 0,min = arr[0];
		for (int i = 0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else  if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		returnArr[0] = min;
		returnArr[1] = max;
		
		return returnArr;
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


public class Assignment1 {
	
	
	public static void main(String[] args) {
		int arr[] = {2,4,1,5,10};
		MinMaxFinder m = new MinMaxFinder(arr);
		int [] result  =  m.minMax();
		for(int i : result ) {
			System.out.println(i);
		}
		
		System.out.println(m.min());
		System.out.println(m.max());

	}



}
