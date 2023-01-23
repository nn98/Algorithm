package BaekJoon.DFS;

import java.io.*;
import java.util.*;

public class P2573 {

	static int n,m,a[][],b[][],v[][],i,j,x[]= {1,0,-1,0},y[]= {0,1,0,-1},k,c,R;

	static void o() {
		for(i=0;++i<n-1;)
			for(j=0;++j<m-1;)
				for(k=0;k<4;k++,a[i][j]=a[i][j]<1?0:a[i][j])
					a[i][j]-=b[i+x[k]][j+y[k]]==0?1:0;
	}
	static void d(int p,int q) {
		v[p][q]++;
		int e=0,r,t;
		for(;e<4;e++) {
			r=p+x[e];
			t=q+y[e];
			if(v[r][t]==0&a[r][t]>0)d(r,t);
		}
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
		for(;;) {
			for(i=0;i<n;System.arraycopy(a[i],0,b[i],0,a[i].length),i++);
			v=new int[n][m];
			c=0;
			for(i=0;++i<n-1&c<2;) {
				for(j=0;++j<m-1&c<2;)
					if(a[i][j]>0&v[i][j]<1) {
						c++;
						d(i,j);
					}
			}
			if(c>1) {
				System.out.print(R);
				System.exit(0);
			}
			if(c<1) {
				System.out.print(c);
				System.exit(0);
			}
			o();
			R++;
		}
	}

}
