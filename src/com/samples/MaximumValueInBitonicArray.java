package com.samples;

import java.util.Scanner;

public class MaximumValueInBitonicArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] data = new int[n];
			
			for(int i = 0; i< n; i++){
				data[i] = scanner.nextInt();
			}
			
			int max = findMaxValue(data,1,n-1);
			
			System.out.println(max);
		}
		
		scanner.close();

	}

	private static int findMaxValue(int[] data, int start, int n) {
		
		if(n <= 2*start){
			for(int i = start; i< n; i++){
				if(data[i] < data[i+1]){
					return data[i];
				}
			}
		}
		
		if(data[start] <= data[start*2]){
			return findMaxValue(data, 2*start, n);
		}
		else{
			for(int i = start; i< n; i++){
				if(data[i] < data[i+1]){
					return data[i];
				}
			}
		}
		
		return 0;
	
	}

}
