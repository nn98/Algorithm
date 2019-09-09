package BaekJoon;

import java.util.Scanner;

public class P10828 {
	
	static Node root=null;
	static int size=0;
	
	static class Node{
		int v;
		Node n;
		Node(int v) {
			this.v=v;
			this.n=null;
		}
		int top() { return this.v; }
		int pop() {
			int r=this.v;
			root=root.n;
			size--;
			return r;
		}
		void push(int v) {
			Node n=new Node(v);
			n.n=root;
			root=n;
			size++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String[] input=s.nextLine().split(" ");
			switch(input[0]) {
			case "push":
				if(root==null) {
					Node N=new Node(Integer.parseInt(input[1]));
					root=N;
					size++;
				}
				else root.push(Integer.parseInt(input[1]));
				break;
			case "pop":
				if(root==null) System.out.println(-1);
				else System.out.println(root.pop());
				break;
			case "top":
				if(root==null) System.out.println(-1);
				else System.out.println(root.top());
				break;
			case "size":
				System.out.println(size);
				break;
			case "empty":
				System.out.println(root==null?1:0);
				break;
			}
		}
	}
}
