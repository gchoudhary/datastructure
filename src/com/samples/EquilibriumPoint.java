package com.samples;

import java.util.Scanner;
/*
 * http://www.practice.geeksforgeeks.org/problem-page.php?pid=1294
 * 
 * Equilibrium point array
 * Given an array A your task is to tell at which position the equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements below it is equal to the sum of elements after it.
 */

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		while(t-- > 0){
			int len = scanner.nextInt();
			int[] data = new int[len];
			for(int i = 0; i< len; i++){
				data[i] = scanner.nextInt();
			}
			
			if(len==1) {
	            System.out.println(1);
	            continue;
	        }
	        if(len==2){
	            System.out.println(-1);
	            continue;
	        }
			int leftSum =0, rightSum =0;
			
			int startPos = 0, endPos = len-1;
			
			while(startPos<endPos){
				if(startPos == 0){
					leftSum += data[startPos++];
					rightSum += data[endPos--];
				}
				else{
					if(leftSum<rightSum){
						leftSum += data[startPos++];
					}
					else if(leftSum>rightSum){
						rightSum += data[endPos--];
					}
					else{
						if(endPos-startPos > 1){
							leftSum += data[startPos++];
							rightSum += data[endPos--];
						}
						break;
					}
				}
				
			}
			
			if(leftSum==rightSum && (startPos-endPos >= -1)){
				System.out.println(startPos+1);
			}
			else{
				System.out.println(-1);
			}
		}

	}

}
