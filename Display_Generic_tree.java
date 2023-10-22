package generic_tree;

import java.util.*;


public class Construction {
	private static  class Node{
		int data;
		ArrayList<Node>children=new ArrayList<>();
	}
	public static void main(String[] args) {
	int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,100,-1,-1,90,-1,-1,40,100,-1,-1,-1};
	Node root=null;
	Stack<Node>st=new Stack<>();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==-1) {
		st.pop();
		}
		else {
		Node t=new Node();
		t.data=arr[i];
		if(st.size()>0) {
			st.peek().children.add(t);
		}
		else {
			root=t;
		}
		st.push(t);
		}
	}
	display(root);
	}
	
	//expectation: it's expected of us to display the children of the node passed in the function.
	//faith: the children of the parameter node know how to display their children and subtrees.
	public static void display(Node node) {
		String str=node.data+"->";
		
		for(Node child:node.children) {
			str+=child.data;
		}
		System.out.println(str+" ");
		
		for(Node child:node.children) {
			display(child);
		}
	}

}

