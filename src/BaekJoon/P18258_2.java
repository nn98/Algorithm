package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P18258_2 {
	static class Node{
		int v;
		Node n;
		Node(int n){v=n;}
	}
	static Node h=null,t=null;
	static int c;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),m;
		for(;n-->0;) {
//			String g=s.next();
			String[]g=r.readLine().split(" ");
			switch(g[0]) {
			case "push":
				c++;
				Node N=new Node(Integer.parseInt(g[1]));
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
				System.out.println(t==null?-1:t.v);
				break;
			}
		}
	}
}