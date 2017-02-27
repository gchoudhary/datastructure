package com.samples;

import java.util.Scanner;

public class FacingTheSun {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int maxTillNow = 0;
			int count = 0;
			for(int i = 0; i< n;i++){
				int value = scanner.nextInt();
				if (value > maxTillNow){
					count++;
					maxTillNow = value;
				}
			}
			
			System.out.println(count);
		}

	}

}
