package BaekJoon.Stack;
// 아니 이 병신같은 백준은 도대체 왜 입출력으로 시간초과를쳐맥여 시발 재채점 좆같이하네
import java.io.*;

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

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine());
		for(int i=0;i<n;i++) {
			String[] input=r.readLine().split(" ");
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
				if(root==null)w.write(-1+"\n");
				else w.write(root.pop()+"\n");
				break;
			case "top":
				if(root==null)w.write(-1+"\n");
				else w.write(root.top()+"\n");
				break;
			case "size":
				w.write(size+"\n");
				break;
			case "empty":
				w.write((root==null?1:0)+"\n");
				break;
			}
		}
		w.flush();
	}
}