package com.samples;

import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			String str = scanner.next();
			int count = 0;
			for(int i = 0; i<n;i++){
				if(str.charAt(i)=='1'){
					count++;
				}
			}
			if(count <=1){
				System.out.println(0);
				continue;
			}
			int value = sumUpAllPast(1,0,count);
			System.out.println(value);
		}

	}

	private static int sumUpAllPast(int key, int value, int count) {
		if(key+1 == count){
			return value+key;
		}
		
		return (sumUpAllPast(key+1,value+key,count));
	}

}
