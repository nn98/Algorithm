package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11266_2 {

	static int v,e,d[],c[],i,n,f,t;
	static List<Integer>[]l;
	static int o(int x,boolean y) {
		int r=0;
		return r;
	}
	public static void main(String[] args) {
		for(int x=7;--x>0;System.out.println(x));
		Scanner s=new Scanner(System.in);
		v=s.nextInt()+1;
		e=s.nextInt();
		d=new int[n];
		c=new int[n];
		l=new List[n];
		for(;++i<v;l[i]=new ArrayList());
		for(;e-->0;f=s.nextInt(),t=s.nextInt(),l[f].add(t),l[t].add(f));
		for(i=0;++i<v;)if(d[i]==0)o(i,true);
	}

}
