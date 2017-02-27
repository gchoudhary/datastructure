package com.samples;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] data= new int[n];
			
			for(int i = 0; i<n;i++){
				data[i] = scanner.nextInt();
			}
			int water = 0;
			
			for(int i = 0; i<n-1;i++){
				
				int leftLargerstPos = i;
				int rightLargerstPos = i;
				for(int j = i; j>=0;j--){
					if(data[leftLargerstPos]<data[j])
						leftLargerstPos = j;
				}
			
				for(int j = i; j<n;j++){
					if(data[rightLargerstPos]<data[j])
						rightLargerstPos = j;
				}
				
				water += (Math.min(data[rightLargerstPos],data[leftLargerstPos])-data[i]);
			}
			
			System.out.println(water);
		}
		scanner.close();
	}
}
