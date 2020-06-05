package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_2 {
	static int n,m,i,j,r[];
	static boolean[]a[],h,f;

	static void o(int x,StringBuffer f) {
		if(h[x])return;
		h[x]=true;
		f.append(x+" ");
		int y=0,c=0;
		for(;++y<n;) {
			if(a[x][y])
				if(h[y])continue;
				else {
					c++;
					o(y,new StringBuffer(f));
				}
		}
		if(c==0)System.out.println(f);
	}

	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(br.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		r=new int[n];
		h=new boolean[n];
		f=new boolean[n];
		a=new boolean[n][n];
		for(;m-->0;t=new StringTokenizer(br.readLine()),i=Integer.parseInt(t.nextToken()),j=Integer.parseInt(t.nextToken()),a[j][i]=true);
		for(m=0;++m<n;o(m,new StringBuffer()),System.out.println(r),h=new boolean[n]);
	}
}