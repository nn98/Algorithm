package _Algorithm.DFS;

import java.util.*;

public class P2668_2 {

	static int n,a[],i,c[],j;
	static List<Integer>r=new ArrayList();
	static void o(int x,int y) {
		if(c[y]<1) {
			c[y]++;
			o(x,a[y]);
		}else if(x==y)r.add(x);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		a=new int[n];
		for(;++i<n;a[i]=s.nextInt());
		for(i=0;++i<n;) {
			c=new int[n];
			o(i,i);
		}
		Collections.sort(r);
		System.out.println(r.size());
		for(int b:r)System.out.println(b);
	}

}
