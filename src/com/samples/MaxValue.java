package com.samples;

import java.util.Scanner;

/*
 * 
 * Input
	1
	5
	9 15 4 12 13
	
	Output
	12    
	

http://www.practice.geeksforgeeks.org/problem-page.php?pid=1330
 */

public class MaxValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] array = new int[n];
			int[] result = new int[n*n];
			
			for(int i = 0; i<n;i++){
				array[i] = scanner.nextInt();
			}
			int count = 0;
			for(int i = 0; i<n;i++){
				for(int j = 0; j<n;j++){
					if(i!=j){
						int p1 = array[i] - i;
						int p2 = array[j] - j;
						
						result[count] = p1 - p2;
						count++;
					}
				}
			}
			
			int max = result[0];
			for(int i = 0; i<n*n; i++){
				if (result[i] > max){
					max = result[i] ;
				}
			}
			
			System.out.println(max);
		}
	}
}
