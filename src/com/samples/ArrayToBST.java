package com.samples;

import java.util.Scanner;

public class ArrayToBST {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t= scanner.nextInt();
		
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] A = new int[n];
			for(int i = 0; i< n; i++){
				A[i] = scanner.nextInt();
			}
			
			Node rootNode = new Node();
			rootNode = createBST(A,rootNode,0,n-1);
		//	System.out.println(rootNode);
			printTreePreOrder(rootNode);
			System.out.println();
		}

	}

	private static void printTreePreOrder(Node rootNode) {
		if(rootNode != null){
			System.out.print(rootNode.getData()+ " ");
			printTreePreOrder(rootNode.getLeft());
			printTreePreOrder(rootNode.getRight());
		}
		
	}

	private static Node createBST(int[] a, Node node,int start, int end) {
		
		int mid = (start+end)/2;
		if(mid==start){
			node.setData(a[mid]);
			if(end != start)
				node.setRight(new Node(null,null,a[end]));
		}
		else{
			node.setData(a[mid]);
			node.setLeft(createBST(a, new Node(), start, mid-1));
			node.setRight(createBST(a, new Node(), mid+1, end));
			
		}
		
		return node;
	}

}


class Node{
	private Node left;
	private Node right;
	
	private int data;

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node(Node left, Node right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public Node() {
		
	}

	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", data=" + data + "]";
	}
	
	
}