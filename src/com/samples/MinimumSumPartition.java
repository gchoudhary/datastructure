package com.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumSumPartition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			
			int n = scanner.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i< n;i++){
				list.add(scanner.nextInt());
			}
			
			Collections.sort(list);
			Collections.reverse(list);
			
			int sum1 = 0, sum2 = 0;
			
			for(Integer i:list){
				if(sum1 > sum2){
					sum2 += i;
				}
				else{
					sum1 += i;
				}
			}
			
			System.out.println(Math.abs(sum2-sum1));
			
			
			
		}
	

	}

}
