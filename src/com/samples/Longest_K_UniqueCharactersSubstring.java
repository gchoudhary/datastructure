package com.samples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_K_UniqueCharactersSubstring {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			String str = scanner.next();
			int n = scanner.nextInt();
			int len = str.length();
			int max = 0;
			boolean found = false;
			for(int i = 0;i <len; i++){
				Set<Character> set = new HashSet<>();
				for(int j = i; j< len; j++){
					set.add(str.charAt(j));

					if(set.size() == n){
						max = (j-i+1) > max ? (j-i+1) : max;
						found = true;
						if(max==len){
							break;
						}
					}
					
				}
				
				if(max==len){
					break;
				}
				
			}
			if(found)
				System.out.println(max);
			else
				System.out.println(-1);
			
		}
		scanner.close();

	}

}
