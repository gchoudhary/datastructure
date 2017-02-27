package com.samples;

import java.util.Scanner;

public class NextLargerElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n= scanner.nextInt();
			int[] data = new int[n];
			int[] result = new int[n];
			for(int i = 0; i< n; i++){
				data[i] = scanner.nextInt();
			}
			for(int i = 0; i< n; i++){
				int flag = data[i];
				boolean flag2 = false;
				result[i] = -1;
				for(int j = i+1; j<n;j++){
					if(data[j] > flag && !flag2){
						flag2 = true;
						result[i] = data[j];
						break;
					}
				}
				
			}
			
			for(int i = 0; i< n; i++){
				System.out.print(result[i] +" ");
			}
			
			System.out.println();
			
		}

	}

}
