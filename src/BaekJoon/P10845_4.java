package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10845_4 {

	static Node root=null,rear=null;
	static boolean isEmpty() {
		return root==null&&rear==null; 
	}
	static class Node{
		int v;
		Node n=null;
		Node(int v) {
			this.v=v;
		}
		void push(int v) {
			this.n=new Node(v);
		}
		int pop() {
			int r=root.v;
			if(root==rear) rear=rear.n;
			root=root.n;
			return r;
		}
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
				if(size==0) {
//					System.out.println("c 1");
					root=new Node(Integer.parseInt(st.nextToken()));
					rear=root;
				}
				else if(size==1) {
//					System.out.println("c 2");
					root.push(Integer.parseInt(st.nextToken()));
					rear=root.n;
				}
				else {
//					System.out.println("c 3");
					rear.push(Integer.parseInt(st.nextToken()));
				}
				size++;
				break;
			case "pop":
				if(root==null) {
					bw.write("-1\n");
				}
				else {
					bw.write(""+root.pop()+"\n");
				}
				if(size>0) size--;
				break;
			case "size":
				bw.write(""+size+"\n");
				break;
			case "empty":
				if(isEmpty())
					bw.write(""+1+"\n");
				else 
					bw.write(""+0+"\n");
				break;
			case "front":
				if(root==null&&rear==null)
					bw.write(""+-1+"\n");
				else
					bw.write(""+root.v+"\n");
				break;
			case "back":
				if(rear==null&&root==null)
					bw.write(""+-1+"\n");
				else
					bw.write(""+rear.v+"\n");
				break;
			}
		}
		bw.flush();
	}
}
