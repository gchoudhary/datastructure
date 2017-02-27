package com.samples;

import java.util.Scanner;

public class PermutationWithSpaces {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- >0){
			String str = scanner.next();
			int maxValue = (int)Math.pow(str.length() - 1,2);
			printPermutaion(str,0,maxValue);
			System.out.println();
		}


	}

	private static void printPermutaion(String str, int value, int maxValue) {
		
			StringBuilder sb = new StringBuilder();
			sb = sb.append("(");
			sb = sb.append(str.substring(0, 1));

			String binary = Integer.toBinaryString(value);
			while(binary.length() < str.length()-1){
				binary = "0" + binary;
			}
			boolean isLast = false;
			for(int i = 1; i<str.length();i++){
				if(binary.charAt(i-1) == '0'){
					sb = sb.append(" ");
					isLast = true;
				}
				else{
					
				}
				
				sb = sb.append(str.substring(i,i+1));
			}
			
			sb = sb.append(")");
			
			
			System.out.println(sb.toString());
			if(isLast)
				printPermutaion(str, value+1,maxValue);
		
		
	}

}
