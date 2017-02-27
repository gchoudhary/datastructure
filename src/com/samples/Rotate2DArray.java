package com.samples;

import java.util.Scanner;

public class Rotate2DArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int[][] data = new int[n][n];
			int[][] out = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j = 0 ;j< n;j++){
					data[i][j] = scanner.nextInt();
				}
			}
			
			for(int i=0; i<n; i++){
				for(int j = 0 ;j< n;j++){
					int ii = n-j-1;
					int jj = i;
					System.out.print(data[ii][jj] + " ");
				}
			}
			System.out.println();
		}

	}

}
