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
		b=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			if(i>0&i<n-1)
				for(j=0;j<m;j++)
					a[i][j]=Integer.parseInt(t.nextToken());
		}
		for(i=0;i<n;System.arraycopy(a[i],0,b[i],0,a[i].length),i++);
//		System.out.println(Arrays.toString(a[2]));
//		System.out.println(Arrays.toString(b[2]));
//		a[2][4]=555;
//		System.out.println(Arrays.toString(a[2]));
//		System.out.println(Arrays.toString(b[2]));
		for(int[]c:a)System.out.println(Arrays.toString(c));
		System.out.println();
		for(int[]c:b)System.out.println(Arrays.toString(c));
		System.out.println();
		o();
		for(int[]c:a)System.out.println(Arrays.toString(c));
		System.out.println();
		for(int[]c:b)System.out.println(Arrays.toString(c));
		
	}

}
