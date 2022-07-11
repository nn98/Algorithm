package _Algorithm.Brute_Force;

import java.io.*;
import java.util.*;


public class P17085 {
	static int n,m,i,j,k,r=1,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0};
	static char[][]a;
	static List<Integer>l=new ArrayList();
	static void o(int x,int y) {
		System.out.println(x+" "+y);
		int c=0,i,X,Y,v;
		boolean C=true,O=false;
		for(;C&++c<=(n<m?n/2:m/2);)for(i=0;C&i<4;i++) {
			X=x+p[i]*c;
			Y=y+q[i]*c;
			C=X>=0&X<n&Y>=0&Y<m;
			if(C)C=a[X][Y]=='#';
			if(C)O=h[X][Y]<c;
		}
		if(O) {
			v=c-1;
			System.out.println(v);
			for(;c-->0;)for(i=0;i<4;i++) {
				X=x+p[i]*c;
				Y=y+q[i]*c;
				h[X][Y]=v;
			}
			l.add(v);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new char[n][];
		h=new int[n][m];
		for(;i<n;a[i++]=r.readLine().toCharArray());
		for(;j<n;j++)for(i=0;i<m;i++)if(a[j][i]=='#')o(j,i);
		for(char[]b:a)System.out.println(b);
		//		for(;k++<)
	}

}
