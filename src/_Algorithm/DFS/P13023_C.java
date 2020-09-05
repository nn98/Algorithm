package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P13023_C {
	static int n,m,a,b,h[];
	static List<Integer>[]v;
	static void o(int i,int x) {
		h[i]=1;
		if(x>3) {
			System.out.print(1);
			System.exit(0);
		}
		for(int j=0;j<v[i].size();j++) {
			if(h[v[i].get(j)]<1)
				o(v[i].get(j),x+1);
		}
		h[i]=0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		h=new int[n];
		v=new List[n];
		m=s.nextInt();
		while(a<n)v[a++]=new ArrayList();
		while(m-->0) {
			a=s.nextInt();
			b=s.nextInt();
			v[a].add(b);
			v[b].add(a);
		}
		for(;++m<n;o(m,0));
		System.out.print(0);
	}
}