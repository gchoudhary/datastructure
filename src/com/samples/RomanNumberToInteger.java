package com.samples;

import java.util.Scanner;

public class RomanNumberToInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			
			String roman = scanner.next();
			int len = roman.length();
			int digit = 0;
			int i ;
			int prvValue = 0;
			int currValue = 0;
			int net = 0;
			for(i = len-1; i>=0; i--){
				char convertToDecimal = roman.charAt(i);

	            switch (convertToDecimal) {
	                case 'M':
	                	currValue = 1000;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 1000;
	                    break;

	                case 'D':
	                	currValue = 500;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 500;
	                    break;

	                case 'C':
	                	currValue = 100;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 100;
	                    break;

	                case 'L':
	                	currValue = 50;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 50;
	                    break;

	                case 'X':
	                	currValue = 10;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 10;
	                    break;

	                case 'V':
	                	currValue = 5;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 5;
	                    break;

	                case 'I':
	                	currValue = 1;
	                    net = processDecimal(currValue, prvValue, net);
	                    prvValue = 1;
	                    break;
	            }
	            
		}
		System.out.println(net);
		
		System.out.println(ToArabic(roman));


	}

}

	private static int processDecimal(int currValue, int prvValue, int net) {
		if(currValue < prvValue){
			net -= currValue;
		}
		else{
			net += currValue;
		}
		return net;
	}
	
	
	public static int ToArabic(String number) {
        if (number.length() == 0) return 0;
        if (number.startsWith("M")) return 1000 + ToArabic(number.substring(1, number.length()));
        if (number.startsWith("CM")) return 900 + ToArabic(number.substring(2, number.length()));
        if (number.startsWith("D")) return 500 + ToArabic(number.substring(1, number.length()));
        if (number.startsWith("CD")) return 400 + ToArabic(number.substring(2, number.length()));
        if (number.startsWith("C")) return 100 + ToArabic(number.substring(1, number.length()));
        if (number.startsWith("XC")) return 90 + ToArabic(number.substring(2, number.length()));
        if (number.startsWith("L")) return 50 + ToArabic(number.substring(1, number.length()));
        if (number.startsWith("XL")) return 40 + ToArabic(number.substring(2, number.length()));
        if (number.startsWith("X")) return 10 + ToArabic(number.substring(1, number.length()));
        if (number.startsWith("IX")) return 9 + ToArabic(number.substring(2, number.length()));
        if (number.startsWith("V")) return 5 + ToArabic(number.substring(1, number.length()));
        if (number.startsWith("IV")) return 4 + ToArabic(number.substring(2, number.length()));
        if (number.startsWith("I")) return 1 + ToArabic(number.substring(1, number.length()));
		return 0;
    }
}
