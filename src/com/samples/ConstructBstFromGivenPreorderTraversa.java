package com.samples;

import java.util.Scanner;

/*
 * Input :
2
5
890 325 290 530 965 
3
3 2 4

Using Preorder, generate BST.... Usage: Left part of any node will be less than node.key and Right part of any node will be more than node.key
read the preorder  data[] use data[0] as root, followed be generate left then right...... in recursive way..

			if(currentIndex < n){
				node.left=constructBSTUtil(data, data[currentIndex], n, minValue, key);
			}
			if(currentIndex < n){
				node.right=constructBSTUtil(data,data[currentIndex], n, key, maxValue);
			}


 */
public class ConstructBstFromGivenPreorderTraversa {
	static int currentIndex =0;

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] data = new int[n];
			currentIndex =0;
			for(int i = 0; i< n; i++){
				data[i] = scanner.nextInt();
			}
			System.out.println("Print BST leaves only :");
			BSTNode root = constructBST(data,n);
			System.out.println("\n" +"Print BST:");
			printInorder(root);
			
			System.out.println();
			}
		scanner.close();
	}

	private static BSTNode constructBST(int[] data, int n) {
		return constructBSTUtil(data,data[0], n,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static BSTNode constructBSTUtil(int[] data, int key, int n, int minValue, int maxValue) {

		BSTNode node = null;
		if(currentIndex >= n){
			return null;
		}
		if(key > minValue && key < maxValue){
			node = new BSTNode(key);
			currentIndex++;
			if(currentIndex < n){
				node.left=constructBSTUtil(data, data[currentIndex], n, minValue, key);
			}
			if(currentIndex < n){
				node.right=constructBSTUtil(data,data[currentIndex], n, key, maxValue);
			}
		}
		
		if(node !=null && node.left == null && node.right == null){
			System.out.print(node.key + " ");
		}
		return node;
	}
	
	private static void printInorder(BSTNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

}

class BSTNode{
	int key;
	BSTNode left,right;
	
	public BSTNode(int key) {
		this.key = key;
	}
}