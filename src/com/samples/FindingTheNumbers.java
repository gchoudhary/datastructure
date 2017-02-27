package com.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindingTheNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int N = n+n+2;
			int[] data = new int[N];
			Map<Integer, Boolean> map = new HashMap<>();
			for(int i = 0;i<N;i++){
				data[i] = scanner.nextInt();
				if(map.containsKey(data[i])){
					map.put(data[i], true);
				}
				else{
					map.put(data[i], false);
				}
			}
			int a = 0, b = 0;
			for(Entry<Integer, Boolean> entry:map.entrySet()){
				if(!entry.getValue()){
				if(a==0){
					a  = entry.getKey();
				}
				else{
					b  = entry.getKey();
				}
				}
			}
			
			if(a<b){
				System.out.println(a + " " + b);
			}
			else
			{
				System.out.println(b + " " + a);
			}
		}

	}

}
