package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9465_C {
	static int n,m,a[][],h[][],l,i,j;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		for(;n-->0;) {
			m=Integer.parseInt(r.readLine());
			a=new int[2][m+1];
			h=new int[2][m+2];
			for(i=0;i<2;i++) {
				StringTokenizer t=new StringTokenizer(r.readLine());
				for(j=1;j<=m;a[i][j++]=Integer.parseInt(t.nextToken()));
			}
			h[0][1]=a[0][1];
			h[1][1]=a[1][1];
			for(;i<=m;i++) {
				h[0][i]=Math.max(h[1][i-1],h[1][i-2])+a[0][i];
				h[1][i]=Math.max(h[0][i-1],h[0][i-2])+a[1][i];
			}
//			for(i=0;i<2;System.out.println(Arrays.toString(h[i++])));
			System.out.println(Math.max(h[0][m],h[1][m]));
		}
	}
}
