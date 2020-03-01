package BaekJoon;

import java.util.Scanner;

public class P18258 {
	static class Node{
		int v;
		Node n;
		Node(int n){v=n;}
	}
	static Node h=null,t=null;
	static int c;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m;
		for(;n-->0;) {
			String g=s.next();
			switch(g) {
			case "push":
				c++;
				Node N=new Node(s.nextInt());
				if(h==null)h=N;
				if(t!=null)t.n=N;
				t=N;
				break;
			case "pop":
				if(h==null)m=-1;
				else {
					m=h.v;
					c--;
					h=h.n;
				}
				System.out.println(m);
				break;
			case "size":
				System.out.println(c);
				break;
			case "empty":
				System.out.println(c==0?1:0);
				break;
			case "front":
				System.out.println(h==null?-1:h.v);
				break;
			case "back":
				System.out.println(t.v);
				break;
			}
		}
	}
}