package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P10866 {

	static Node root=null,rear=null;

	static class Node{
		int v;
		Node n;
		public Node(int v) {
			this.v=v;
			n=null;
		}
		public void pF(int v) {
			Node n=new Node(v);
			n.n=root;
			root=n;
		}
		public void pB(int v) {
			Node n=root;
			while(n.n!=null) n=n.n;
			n.n=new Node(v);
		}
		public int f() {
			return v;
		}
		public int b() {
			Node n=root;
			while(n.n!=null) n=n.n;
			return n.v;
		}
		public int pf() {
			int r=this.v;
			root=root.n;
			return r;
		}
		public int pb() {
			if(root.n==null) {
				int r=root.v;
				root=null;
				return r;
			}
			else {
				Node n=root,m=n;
				while(n.n!=null) {
					m=n;
					n=n.n;
				}
				int r=n.v;
				m.n=null;
				return r;
			}
		}
		public int s() {
			Node n=root;
			int i=0;
			while(n!=null) {
				n=n.n;
				i++;
			}
			return i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		for(int i=0;i<N;i++) {
			String t=s.nextLine();
			if(t.equals("front")) {
				if(root==null) System.out.println("-1");
				else System.out.println(root.f());
			} else if(t.equals("back")) {
				if(root==null) System.out.println("-1");
				else System.out.println(root.b());
			} else if(t.equals("size")) {
				if(root==null) System.out.println("0");
				else System.out.println(root.s());
			} else if(t.equals("empty")) {
				if(root==null) System.out.println("1");
				else System.out.println("0");
			} else if (t.equals("pop_front")) {
				if(root==null) System.out.println("-1");
				else System.out.println(root.pf());
			} else if (t.equals("pop_back")) {
				if(root==null) System.out.println("-1");
				else System.out.println(root.pb());
			} else {
//				System.out.println(t);
				String[] a=t.split("\\s");
//				System.out.println(Arrays.toString(a));
				if(a[0].equals("push_back")) {
					if(root==null) root=new Node(Integer.parseInt(a[1]));
					else root.pB(Integer.parseInt(a[1]));
				}
				else {
					if(root==null) root=new Node(Integer.parseInt(a[1]));
					else root.pF(Integer.parseInt(a[1]));
				}
			}
		}
	}
}
