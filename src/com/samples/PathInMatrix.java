package com.samples;

import java.util.Scanner;

public class PathInMatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int[][] data= new int[n][n];
			
			for(int i = 0; i<n; i++){
				for(int j = 0; j< n; j++){
					data[i][j] = scanner.nextInt();
				}
			}
			
			int[][] maxData= new int[n][n];
			
			for(int i = n-1;i>=0;i--){
				for(int j = 0; j< n; j++){
					int max =0;
					if(i != n-1){
						if(j!=0 && j != n-1){
							max = Math.max(Math.max(maxData[i+1][j], maxData[i+1][j-1]),maxData[i+1][j+1]);
						}
						else if(j!=0){
							max = Math.max(maxData[i+1][j], maxData[i+1][j-1]);
						}
						else if(j != n-1){
							max = Math.max(maxData[i+1][j], maxData[i+1][j+1]);
						}
						
						maxData[i][j] = data[i][j] + max;
							
					}
					else{
						maxData[i][j]= data[i][j];
					}
				}
			}
			
			int max = maxData[0][0];
			for(int i = 0; i< n;i++){
				if(maxData[0][i] > max){
					max = maxData[0][i];
				}
			}
			System.out.println(max);
					
			
			/*for(int i = 0; i<n; i++){
				for(int j = 0; j< n; j++){
					System.out.print(maxData[i][j] + " ");
				}
				System.out.println();
			}*/
			
		}

	}

}
