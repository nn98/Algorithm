package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P10825 {

	static String w;
	static int x,y,z;
	static class P implements Comparable<P>{
		String n;
		int a,b,c;
//		p(int a,int b,int c){
//			a=a;
//		}
		P(){
			n=w;
			a=x;
			b=y;
			c=z;
		}
		@Override
		public int compareTo(P p) {
			if(a==p.a) {
				if(b==p.b) {
					if(c==p.c)
						return n.compareTo(p.n);
					return p.c-c;
				}
				return b-p.b;
			}
			return p.a-a;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=n;
		P[]a=new P[n];
		for(;i-->0;w=s.next(),x=s.nextInt(),y=s.nextInt(),z=s.nextInt(),a[i]=new P());
		Arrays.sort(a);
		for(;++i<n;System.out.println(a[i].n));
	}

}
