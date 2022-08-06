package _Algorithm.Data_Structure;
import java.io.*;
import java.util.*;
public class P10845 {
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
	public static void main(String args[]) throws Exception {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),size=0;
		StringTokenizer st;
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(r.readLine());
			String t=st.nextToken();
			switch(t) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				size++;
				break;
			case "pop":
				if(root==null) {
					w.write("-1\n");
				}
				else {
					w.write(""+pop()+"\n");
				}
				if(size>0) size--;
				break;
			case "size":
				w.write(gS()+"\n");
				break;
			case "empty":
				if(root==null&&rear==null)
					w.write(""+1+"\n");
				else 
					w.write(""+0+"\n");
				break;
			case "front":
				if(root==null)
					w.write(""+-1+"\n");
				else
					w.write(""+root.v+"\n");
				break;
			case "back":
				if(rear==null)
					w.write(""+-1+"\n");
				else
					w.write(""+rear.v+"\n");
				break;
			}
		}
		w.flush();
	}
}
