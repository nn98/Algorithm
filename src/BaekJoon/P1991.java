package BaekJoon;

import java.util.Scanner;

public class P1991 {

	static class Node{
		String s=null;
		Node l,r;

		public Node(String s) {
			this.s=s;
			l=null;
			r=null;
		}

		public void aL(String t, String s) {
			if(this.s.equals(t))
				this.l=new Node(s);
			else {
				if(this.l!=null)
					this.l.aL(t, s);
				if(this.r!=null)
					this.r.aL(t, s);
			}
		}
		public void aR(String t, String s) {
			if(this.s.equals(t))
				this.r=new Node(s);
			else {
				if(this.l!=null)
					this.l.aR(t, s);
				if(this.r!=null)
					this.r.aR(t, s);
			}
		}
		public void preO() {
			System.out.print(s);
			if(this.l!=null)this.l.preO();
			if(this.r!=null)this.r.preO();
		}
		public void inO() {
			if(this.l!=null)this.l.inO();
			System.out.print(s);
			if(this.r!=null)this.r.inO();
		}
		public void postO() {
			if(this.l!=null)this.l.postO();
			if(this.r!=null)this.r.postO();
			System.out.print(s);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		Node root=null;
		s.nextLine();
		for(int i=0;i<N;i++) {
			String[] t=s.nextLine().split(" ");
			if(root==null) {
				root=new Node(t[0]);
			}
			if(!t[1].equals("."))
				root.aL(t[0], t[1]);
			if(!t[2].equals("."))
				root.aR(t[0], t[2]);
		}
		root.preO();
		System.out.println();
		root.inO();
		System.out.println();
		root.postO();
	}
}
