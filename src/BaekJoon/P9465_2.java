package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9465_2 {
	static int n,m,a[][],h[][],l,i,j;
	static void o(int x,int v,int c) {
//		System.out.println(x+" "+c);
		if(x==m) {
			l=l>v?l:v;
			return;
		}
		if(c<2)h[c][x]=v;
		o(x+1,v,2);
		if(c!=1)if(h[1][x+1]<v+a[0][x])o(x+1,v+a[0][x],1);
		if(c!=0)if(h[0][x+1]<v+a[1][x])o(x+1,v+a[1][x],0);
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
			o(0,0,2);
			for(i=0;i<2;System.out.println(Arrays.toString(h[i++])));
			System.out.println(l);
			l=0;
		}
	}
}

/*
0 0
1 2
2 2
3 2
4 2
4 1
4 0
3 1
4 2
4 0
3 0
4 2
4 1
2 1
3 2
4 2
4 1
4 0
3 0
4 2
4 1
2 0
3 2
4 2
4 1
4 0
3 1
4 2
4 0
1 1
2 2
3 2
4 2
4 1
4 0
3 1
4 2
4 0
3 0
4 2
4 1
2 0
3 2
4 2
4 1
4 0
3 1
4 2
4 0
*/