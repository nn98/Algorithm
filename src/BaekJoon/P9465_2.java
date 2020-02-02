package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9465_2 {
	static int n,m,a[][],h[][],l,i,j;
	static void o(int x,int v,int c) {
		System.out.println(x+" "+c);
		if(x==m-1) {
			l=l>v?l:v;
			return;
		}
		if(c<2) {
			h[c][x]=v+a[c][x];
		}
		o(x+1,v,2);
		if(c!=1)o(x+1,h[c][x],1);
		if(c!=0)o(x+1,h[c][x],0);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		for(;n-->0;) {
			m=Integer.parseInt(r.readLine());
			a=new int[2][m];
			h=new int[2][m];
			for(i=0;i<2;i++) {
				StringTokenizer t=new StringTokenizer(r.readLine());
				for(j=0;j<m;a[i][j++]=Integer.parseInt(t.nextToken()));
			}
			o(0,0,0);
			for(i=0;i<3;System.out.println(Arrays.toString(h[i++])));
			System.out.println(l);
			l=0;
		}
	}
}
