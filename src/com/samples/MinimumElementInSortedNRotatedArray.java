package com.samples;

import java.util.Scanner;

public class MinimumElementInSortedNRotatedArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		while(t-- > 0 ){
			int n = scanner.nextInt();
			int[] data = new int[n];
			
			for(int i = 0; i< n;i++){
				data[i] = scanner.nextInt();
			}
			
			int minValue = findMinUsingBinarySearch(data,0,n-1);
			System.out.println(minValue);
		}
		
		

	}

	private static int findMinUsingBinarySearch(int[] data, int start, int end) {

		int mid = (start+end)/2;
		if(mid==start){
			return data[mid]<data[end]?data[mid]:data[end];
		}
		
		if(data[mid] > data[end]){
			return findMinUsingBinarySearch(data, mid, end);
		}
		else{
			return findMinUsingBinarySearch(data, start, mid);
		}
	}

}
