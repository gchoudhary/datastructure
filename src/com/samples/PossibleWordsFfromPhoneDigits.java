package com.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PossibleWordsFfromPhoneDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] data = new int[n];
			int[] A = new int[n];
			int[] maxA = new int[n];
			
			for(int i = 0; i<n; i++){
				data[i] = scanner.nextInt();
				maxA[i] = map.get(data[i]).length();
			}

			functionName(A,maxA,data,map,n);
			System.out.println();
		}
		scanner.close();
	}

	private static void functionName(int[] a, int[] maxA, int[] data, 
			Map<Integer, String> map, int n) {		
		
		for(int i = 0; i<n;i++){
			System.out.print(map.get(data[i]).charAt(a[i]));
		}
		System.out.print(" ");
		
		for(int i = n-1; i>=0;i--){
			if(a[i] >= (maxA[i]-1)){
				a = recursiveCall(a,maxA,i,n);
			}
			else{
				a[i]++;
			}
			break;
		}		
		if(a == null){
			return;
		}
		
		functionName(a, maxA, data, map, n);
	}

	private static int[] recursiveCall(int[] a, int[] maxA, int i, int n) {
		for(int j = i; j<n;j++){
			a[j] = 0;	
		}
		if(i!=0){
			a[i-1]++;
			if(a[i-1] >= (maxA[i-1])){
				a[i-1]=0;
				a = recursiveCall(a, maxA, i-1, n);
			}
		}
		else{
			//System.out.println("END");
			return null;
		}
		return a;
	}
}