package com.samples;

import java.util.Scanner;
/*
 * Given a sorted array, arr[] and a value, x, find floor of x in given array. Floor of x is the largest element in arr[] 
 * such that the element is smaller than or equal to x. If floor exists, then return index of it, else return -1.
 * 
 * Its just like binary search. For safe side we have boundary checks before search begins.  
 * 
 * http://www.practice.geeksforgeeks.org/problem-page.php?pid=1303
 */

public class FloorInSortedArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int toFloor = scanner.nextInt();
			int[] data = new int[n];
			
			for(int i = 0; i < n ; i++){
				data[i] = scanner.nextInt();
			}
			
			if(data[0] > toFloor){
				System.out.println(-1);
				continue;
			}
			else if(data[n] <= toFloor){
				System.out.println(n-1);
				continue;
			}
			else{
				int location = binarySearchForFloor(data,0,n-1,toFloor);
				System.out.println(location);
			}
		}

	}

	private static int binarySearchForFloor(int[] data, int start, int end, int toFloor) {
		
		int mid = (start+end)/2;
		
		if(mid == start){
			if(data[mid]==data[end])
				return end;
			else
				return mid;
		}
		
		if(toFloor >= data[mid]){
			return binarySearchForFloor(data,mid,end,toFloor);
		}
		
		else if(toFloor < data[mid]){
			return binarySearchForFloor(data,start,mid,toFloor);
		}	
		
		return 0;
	}

}
