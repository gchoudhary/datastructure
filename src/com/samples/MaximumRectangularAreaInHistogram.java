package com.samples;

import java.util.Scanner;

public class MaximumRectangularAreaInHistogram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- >0){
			int n = scanner.nextInt();
			int[] data= new int[n];
			for(int i = 0; i<n; i++){
				data[i] = scanner.nextInt();
			}
			
			int max= 0;
			
			for(int i = 0; i < n ;i++){
				int sum = 0;
				for(int j = i; j<n;j++){
					if(data[j]<data[i]){
						break;
					}
					else{
						sum++;
					}
				}
				
				
				for(int j = i-1; j>=0;j--){
					if(data[j]<data[i]){
						break;
					}
					else{
						sum++;
					}
				}
				
				sum = sum * data[i];
				
				if(max < sum){
					max = sum;
				}
			}
			
			System.out.println(max);
			
		}

	}

}
