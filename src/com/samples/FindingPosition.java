package com.samples;

import java.util.Scanner;

public class FindingPosition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int result = findPos(n/2,1);
			System.out.println(result);
		}

	}

	private static int findPos(int n, int i) {
		if(n != 0){
			return findPos(n/2, i*2);
		}
		return i;
	}

}
