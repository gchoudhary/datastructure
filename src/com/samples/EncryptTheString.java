package com.samples;

import java.util.Scanner;

public class EncryptTheString {

	public static void main(String[] args) {
		int t = 0;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		while(t != 0){
			String str = scanner.next();
			StringBuilder sb=new StringBuilder();
			int count = 1;
			for(int i = 1; i< str.length();i++){
				if(str.charAt(i)==str.charAt(i-1)){
					count++;
				}
				else{
					sb.append(str.substring(i-1, i));
					sb.append(count);
					count = 1;
				}
			}
			sb.append(str.substring(str.length()-1, str.length()));
			sb.append(count);
			sb = sb.reverse();
			System.out.println(sb.toString());
			t--;
		}

	}

}