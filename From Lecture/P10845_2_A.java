package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10845_2_A {

	static Node root=null,rear=null;
	static class Node{
		int v;
		Node n=null;
		Node(int v) {
			this.v=v;
		}
	}
	static void push(int v) {
		if(root==null) {
			root=new Node(v);
			rear=root;
		}
		else {
			rear.n=new Node(v);
			rear=rear.n;
		}
	}
	static int pop() {
		int r=root.v;
		if(root==rear) rear=rear.n;
		root=root.n;
		return r;
	}
	static int gS() {
		int r=0;
		Node n=root;
		while(n!=null) {
			r++;
			n=n.n;
		}
		return r;
	}
	public static void main(String args[]) throws IOException {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),size=0;
		s.nextLine();
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(s.nextLine());
			String t=st.nextToken();
			switch(t) {
			case "push":
				//				System.out.print("push ");
				push(Integer.parseInt(st.nextToken()));
				size++;
				break;
			case "pop":
				if(root==null) {
					System.out.print("-1\n");
				}
				else {
					System.out.print(""+pop()+"\n");
				}
				if(size>0) size--;
				break;
			case "size":
				System.out.print(gS()+"\n");
				break;
			case "empty":
				if(root==null&&rear==null)
					System.out.print(""+1+"\n");
				else 
					System.out.print(""+0+"\n");
				break;
			case "front":
				if(root==null)
					System.out.print(""+-1+"\n");
				else
					System.out.print(""+root.v+"\n");
				break;
			case "back":
				if(rear==null)
					System.out.print(""+-1+"\n");
				else
					System.out.print(""+rear.v+"\n");
				break;
			}
		}
		//		bw.flush();
	}
}
