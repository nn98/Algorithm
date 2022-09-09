package _Algorithm.Brute_Force;

import java.io.*;
import java.util.*;


public class P17085 {
	static int n,m,i,j,k,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0};
	static char[][]a;
	static List<Integer>l=new ArrayList();
	static void o(int x,int y) {
//		System.out.println(x+" "+y);
		int c=0,i,X,Y,v;
		boolean C=true,Q=true;
		for(;C&c<=(n<m?n/2:m/2);c+=i>3?1:0)for(i=0;C&i<4;i++) {
			X=x+p[i]*c;
			Y=y+q[i]*c;
			C=X>=0&X<n&Y>=0&Y<m;
			if(C)C=a[X][Y]=='#';
			if(!C)i--;
//			if(C)System.out.println("\t"+"X: "+X+" Y: "+Y+" c: "+c+" i: "+i);
		}
		if(c>1) {
			v=c-1;
//			System.out.println(v);
			for(;Q&c-->0;)for(i=0;Q&i<4;i++) {
				X=x+p[i]*c;
				Y=y+q[i]*c;
//				System.out.println("\t"+"X: "+X+" Y: "+Y+" i: "+i);
				Q=h[X][Y]<=v;
				if(Q)h[X][Y]=v;
			}
//			for(int[]b:h)System.out.println(Arrays.toString(b));
			if(Q)l.add(1+v*4);
//			System.out.println(l);
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
//		for(char[]b:a)System.out.println(b);
		//		for(;k++<)
		Collections.sort(l);
		j=1;
		for(k=0;k<l.size()&k<2;k++)j*=l.get(k);
		System.out.println(j);
	}

}
