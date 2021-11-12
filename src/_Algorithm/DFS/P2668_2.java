package _Algorithm.DFS;

import java.util.*;

public class P2668_2 {

	static int n,a[],i,c[];
	static List<Integer>l,r=new ArrayList();
	static void o(int x) {
		if(x==a[x]&!r.contains(x))r.add(x);
		else{
			c[x]++;
			l.add(x);
			if(c[a[x]]<1)o(a[x]);
			if(l.contains(a[x])&!r.contains(a[x]))r.add(a[x]);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		for(;++i<n;a[i]=s.nextInt());
		for(i=0;++i<n;) {
			l=new ArrayList();
			if(!r.contains(i))
				o(i);
		}
		System.out.println(r.size());
		System.out.println(r);
	}

}
