package com.samples;

import java.util.*;

public class DistanceOfNearestCellHaving1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			int[][] mat = new int[n][m];
			boolean[][] isCovered = new boolean[n][m];
			
			List<Location> list = new ArrayList<>();
			for(int i = 0; i< n ;i++){
				for(int j = 0; j< m; j++){
					mat[i][j] = scanner.nextInt();
					isCovered[i][j] = false;
					
					if(mat[i][j] == 1){
						Location loc = new Location(i, j, false);
						list.add(loc);
						isCovered[i][j] = true;
					}
				}
			}
			
			while(!list.isEmpty()){
				Location index = list.remove(0);
				List<Location> validNeighbours = getValidNeighbours(index,isCovered,mat,n,m);
				
				list.addAll(validNeighbours);
				
			}
			
			for(int i = 0; i< n ;i++){
				for(int j = 0; j< m; j++){
					System.out.print((mat[i][j] - 1) + " ");
			}
			}
			
			System.out.println();
		}
		
	}

	private static List<Location> getValidNeighbours(Location index, boolean[][] isCovered, int[][] data, int n, int m) {
		Location left,right,up, down;
		
		List<Location> list = new ArrayList<>();
		
		
		if(checkIndex(index, isCovered, n,m, -1,0)){
			up = new Location(index.getI()-1,index.getJ(),false);
			list.add(up);
			data[index.getI()-1][index.getJ()] = data[index.getI()][index.getJ()] +1;
			isCovered[index.getI()-1][index.getJ()] = true;
		}
		if(checkIndex(index, isCovered, n,m, +1,0)){
			down = new Location(index.getI()+1,index.getJ(),false);
			list.add(down);
			data[index.getI()+1][index.getJ()] = data[index.getI()][index.getJ()] +1;
			isCovered[index.getI()+1][index.getJ()] = true;
		}
		if(checkIndex(index, isCovered, n,m, 0,-1)){
			left = new Location(index.getI(),index.getJ()-1,false);
			list.add(left);
			data[index.getI()][index.getJ()-1] = data[index.getI()][index.getJ()] +1;
			isCovered[index.getI()][index.getJ()-1] = true;
		}
		if(checkIndex(index, isCovered, n,m, 0,1)){
			right = new Location(index.getI(),index.getJ()+1,false);
			list.add(right);
			data[index.getI()][index.getJ()+1] = data[index.getI()][index.getJ()] +1;
			isCovered[index.getI()][index.getJ()+1] = true;
		}
				
			return list;
		}
	
	
	private static boolean checkIndex(Location index, boolean[][] isCovered, int n,int m, int i, int j) {
		return isValidLocation(index.getI()+i,index.getJ()+j, n,m) && !isCovered[index.getI()+i][index.getJ()+j];
	}

	private static boolean isValidLocation(int i, int j, int n, int m) {

		if(i >= 0 && i <= n-1 && j >= 0 && j <= m-1)
			return true;
		
		return false;
	}
}

class Location{
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
	public Location(int i, int j, boolean isCovered) {
		super();
		this.i = i;
		this.j = j;
		this.isCovered = isCovered;
	}
	
}
	
	
