package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9465 {

	static int n,m,a[][],h[][],l,i,j;
	static void o(int x,int v,int c) {
		System.out.println(x+" "+c);
		h[c][x]=c==0?v:v+a[c-1][x];
		if(x!=m-1) {
			if(h[0][x+1]<v)	o(x+1,v,0);
			if(c!=1)if(h[1][x+1]<v+a[0][x])o(x+1,v+a[0][x],1);
			if(c!=2)if(h[2][x+1]<v+a[1][x])o(x+1,v+a[1][x],2);
		}else {
			l=l>h[c][x]?l:h[c][x];
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		for(;n-->0;) {
			m=Integer.parseInt(r.readLine());
			a=new int[2][m];
			h=new int[3][m];
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