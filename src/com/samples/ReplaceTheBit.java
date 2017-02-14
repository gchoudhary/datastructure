package com.samples;

import java.util.Scanner;

public class ReplaceTheBit {

	public static void main(String[] args) {

		int t = 0;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		while(t != 0){
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int nCopy= n;
			int bits=0;
			while(nCopy > 0){
				nCopy = nCopy/2;
				bits++;
			}
			nCopy= n;
			int value = 0;
			for(int i= 0; i< bits; i++){
				if(i==bits-k){
					if(nCopy%2!=0){
						value = (int)Math.pow(2, (i));
					}
					break;
				}
				nCopy = nCopy/2;
				
			}
			System.out.println(n-value);
			
			t--;
		}

	}

}