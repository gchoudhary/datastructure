package com.samples;

import java.util.Scanner;

public class TicTacToeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
			int n = 3;
			char[][] board = new char[n][n];
			for(int i = 0; i<n;i++){
				for(int j = 0; j< n;j++){
					board[i][j] = scanner.next().charAt(0);
				}
			}
			
			int countX = 0, countY = 0;
			
			for(int i = 0; i<n;i++){
				for(int j = 0; j< n;j++){
					if(board[i][j] =='X'){
						countX++;
					}
					else{
						countY++;
					}
				}
			}
			
			if(countX==5 && countY ==4){
				boolean flagX = isValidXOPattern(board, n, 'X');
				boolean flagO = isValidXOPattern(board, n, 'O');
				
				if(flagX && flagO){
					System.out.println("Invalid");
				}
				else{
					System.out.println("Valid");
				}

			}
			else{
				System.out.println("Invalid");
			}
			
			
			
		}
	}

	private static boolean isValidXOPattern(char[][] board, int n, char xo) {
		boolean flag = false;
		
		for(int i = 0; i< n ; i++){
			if(board[i][0]== xo && board[i][1]== xo && board[i][2]== xo){
				flag = true;
			}
			else if(board[0][i]== xo && board[1][i]== xo && board[2][i]== xo){
				flag = true;
			}
			else if(board[0][0]== xo && board[1][1]== xo && board[2][2]== xo){
				flag = true;
			}
			else if(board[2][0]== xo && board[1][1]== xo && board[0][2]== xo){
				flag = true;
			}
		}
		
		return flag;
	}

}
