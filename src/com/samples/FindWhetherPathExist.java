package com.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Find whether path exist
 * 
 * http://www.practice.geeksforgeeks.org/problem-page.php?pid=1672
 * 
 * Given a N X N matrix (M) filled with 1 , 0 , 2 , 3 . Your task is to find whether there is a path possible from source to destination, while traversing through blank cells only. You can traverse up, down, right and left.

A value of cell 1 means Source.
A value of cell 2 means Destination.
A value of cell 3 means Blank cell.
A value of cell 0 means Blank Wall.
Note : there is only single source and single destination.
 * 
 * 
 * 
 * Input : M[3][3] = {{ 0 , 3 , 2 },
                   { 3 , 3 , 0 },
                   { 1 , 3 , 0 }};
Output : Yes

Input : M[4][4] = {{ 0 , 3 , 1 , 0 },
                   { 3 , 0 , 3 , 3 },
                   { 2 , 3 , 0 , 3 },
                   { 0 , 3 , 3 , 3 }};
Output : Yes


Input:
2
4
3 0 0 0 0 3 3 0 0 1 0 3 0 2 3 3 
3
0 3 2 3 0 0 1 0 0
Output:
1
0
 */

public class FindWhetherPathExist {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- >0){
			
			int n = scanner.nextInt();
			int [][] data = new int[n][n];
			boolean [][] isCovered = new boolean[n][n];
			List<Index> list = new ArrayList<>();
			boolean flag = false;

			for(int i = 0; i<n; i++){
				for(int j = 0; j<n; j++){
					data[i][j] = scanner.nextInt();
					isCovered[i][j] = false;
					if(data[i][j] == 1){
						Index index = new Index(i,j,true);
						list.add(index);
						isCovered[i][j] = true;
					}
				}
			}
			
			while(!list.isEmpty()){
				Index index = list.remove(0);
				if(data[index.getI()][index.getJ()] == 2){
					flag = true;
				}
				List<Index> validNeighbours = getValidNeighbours(index,isCovered,data,n);
				
				list.addAll(validNeighbours);
			}
			if(flag){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
			
			
			
		}

	}

	private static List<Index> getValidNeighbours(Index index, boolean[][] isCovered, int[][] data, int n) {
		Index left,right,up, down;
		
		List<Index> list = new ArrayList<>();
		
		
		if(checkIndex(index, isCovered, n, -1,0)){
			if(data[index.getI()-1][index.getJ()] != 0){
				up = new Index(index.getI()-1,index.getJ(),false);
				list.add(up);
			}
			isCovered[index.getI()-1][index.getJ()] = true;
		}
		if(checkIndex(index, isCovered, n, +1,0)){
			if(data[index.getI()+1][index.getJ()] != 0){
				down = new Index(index.getI()+1,index.getJ(),false);
				list.add(down);
			}
			isCovered[index.getI()+1][index.getJ()] = true;
		}
		if(checkIndex(index, isCovered, n, 0,-1)){
			if(data[index.getI()][index.getJ()-1] != 0){
				left = new Index(index.getI(),index.getJ()-1,false);
				list.add(left);
			}
			isCovered[index.getI()][index.getJ()-1] = true;
		}
		if(checkIndex(index, isCovered, n, 0,1)){
			if(data[index.getI()][index.getJ()+1] != 0){
				right = new Index(index.getI(),index.getJ()+1,false);
				list.add(right);
			}
			isCovered[index.getI()][index.getJ()+1] = true;
		}
				
			return list;
		}

	private static boolean checkIndex(Index index, boolean[][] isCovered, int n, int i, int j) {
		return isValidLocation(index.getI()+i,index.getJ()+j, n) && !isCovered[index.getI()+i][index.getJ()+j];
	}

	private static boolean isValidLocation(int i, int j, int n) {

		if(i >= 0 && i <= n-1 && j >= 0 && j <= n-1)
			return true;
		
		return false;
	}
		

}

class Index{
	int i;
	int j;
	boolean isCovered;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public boolean isCovered() {
		return isCovered;
	}
	public void setCovered(boolean isCovered) {
		this.isCovered = isCovered;
	}
	public Index(int i, int j, boolean isCovered) {
		super();
		this.i = i;
		this.j = j;
		this.isCovered = isCovered;
	}
	
	
	
}
