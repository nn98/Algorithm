package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P2573 {

	static int n,m,a[][],b[][],v[][],i,j,x[]= {1,0,-1,0},y[]= {0,1,0,-1},k;
	
	static void o() {
		for(i=0;++i<n-1;)
			for(j=0;++j<n-1&a[i][j]>0;)
				for(k=0;k<4;k++,a[i][j]=a[i][j]<1?0:a[i][j])
					a[i][j]-=b[i+x[k]][j+y[k]]==0?1:0;
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			if(i>0&i<n-1)
				for(j=0;j<n;j++)
					a[i][j]=Integer.parseInt(t.nextToken());
		}
//		b=a.clone();
		b=Arrays.copyOf(a,a.length);
		a[2][4]=555;
		for(int[]c:a)System.out.println(Arrays.toString(c));
		for(int[]c:b)System.out.println(Arrays.toString(c));
	}

}
