package com.samples;

import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int xor = 0;
			for(int i = 0; i< n; i++){
				xor = xor ^(scanner.nextInt());
			}
			System.out.println(xor);
			
		}

	}

}
