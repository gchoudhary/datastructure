package com.samples;


class Node2
{
	Node2 next;
	int data;
	Node2(int d)
	{
		data = d;
		next = null;
	}
	@Override
	public String toString() {
		return "Node2 [next=" + next + ", data=" + data + "]";
	}

}


class GfG
{
    /*You are required to complete this method
    8
1 2 3 4 5 6 7 8
3
    
    */
    Node2 delete(Node2 head, int k)
    {
        Node2 tempHead = head;
        int count = 0;
        while(head != null){
            count++;
            if(count % k == (k-1)){
                Node2 past = head;
                if(head.next != null){
                    if((head.next).next != null)
                        past.next = (head.next).next;
                    else
                        past.next = null;
                }
            }
            head = head.next;
        }
	// Your code here	 
		return tempHead;
    }
}

public class ExpressionTree{
	public static void main(String[] args) {
		Node2 node = new Node2(0);
		Node2 Headnode = node;
		
		for(int i = 1; i< 10;i++){
			node.next = new Node2(2*i);
			node = node.next;
		}
		GfG g = new GfG();
		System.out.println(Headnode);
		node = g.delete(Headnode, 3);
		System.out.println(node);
		
	}
}