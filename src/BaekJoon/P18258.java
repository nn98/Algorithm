package BaekJoon;

import java.util.Scanner;

public class P18258 {

	static class Node{
		int v;
		Node n;
		Node(int n){n=v;}
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
			}
		}
	}

}
