package com.samples;

import java.util.Scanner;

/*
 * http://www.practice.geeksforgeeks.org/problem-page.php?pid=1616
 */

public class InterestingPatterns {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int N = (2*n) -1;
			int[][] matrix = new int[N][N];
			
			for(int i = 0; i<N;i++){
				for(int j = 0; j<N;j++){
					int a = Math.max(Math.abs(i-n+1), Math.abs(j-n+1));
					matrix[i][j] =a+1;
				}
			}
			
			for(int i = 0; i<N;i++){
				for(int j = 0; j<N;j++){
			System.out.print(matrix[i][j] + " ");
						
				}
				System.out.println();
			}
			
		}

	}

}
