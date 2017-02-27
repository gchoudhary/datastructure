package com.samples;

import java.util.Scanner;

public class SmallestRepunitsMultipler {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int nCopy = n;
			int reminder =-1;
			
			int count = 0;
			int number = 0;
			while(nCopy != 0){
				count++;
				number = (number*10)+1;
				nCopy /= 10;
			}
			
			number = (number*10)+1;
			count++;
			nCopy = n;
			
			while(reminder!=0){
				int q = number/n;
				
			}
			
			System.out.println("Count: " + count);
			System.out.println("Number: "+ number);
		}

	}

}
