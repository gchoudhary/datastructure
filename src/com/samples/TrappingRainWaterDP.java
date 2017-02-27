package com.samples;

import java.util.Scanner;

public class TrappingRainWaterDP {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] data= new int[n];
			int[] leftMax= new int[n];
			int[] rightMax= new int[n];
			for(int i = 0; i<n;i++){
				data[i] = scanner.nextInt();
			}
			int max = data[0];
			for(int i = 0; i<n;i++){
				if(data[i] > max){
					max = data[i];
				}
				leftMax[i]=max;
			}
			max = data[n-1];
			for(int i = n-1; i>=0;i--){
				if(data[i] > max){
					max = data[i];
				}
				rightMax[i]=max;
			}
			int water = 0;
			
			for(int i = 0; i<n;i++){
				water += (Math.min(leftMax[i],rightMax[i])-data[i]);
			}
			System.out.println(water);
		}
		scanner.close();
	}

}
