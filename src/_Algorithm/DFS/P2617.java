package _Algorithm.DFS;

import java.io.*;
import java.util.*;
public class P2617 {
	static int n,m,i,j,k,a[][];
	static void h(int x) {
		a[x][k]=-1;
		for(int i=0;++i<n;)
			if(a[x][i]>0) {
				a[k][i]=1;
				h(i);
			}
	}
	static void l(int x) {
		a[x][k]=1;
		for(int i=0;++i<n;)
			if(a[x][i]<0) {
				a[k][i]=-1;
				l(i);
			}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[j][i]=1;
			k=j;
			h(i);
//			for(k=0;++k<n;a[j][k]=a[i][k]>0?1:a[j][k]);
			a[i][j]=-1;
			k=i;
			l(j);
//			for(k=0;++k<n;a[i][k]=a[j][k]<0?-1:a[i][k]);
//			for(int[]b:a)System.out.println(Arrays.toString(b));
		}
		m=0;
		for(int[]b:a) {
			k=0;
			for(int c:b)k+=c==0?1:0;
			m+=k<=n/2?1:0;
		}
		System.out.println(m);
//		for(m=0;++m<n;) {
//			for(j=0;++j<n;) {
//				if(a[m][j]!=0)
//					if(a[m][j]>0)h(j);
//					else l(j);
//			}
//			i=0;
//			for(int b:a[m])i+=b==0?1:0;
////			System.out.println(m+" "+i);
//			k+=i<=n/2?1:0;
//		}
//		System.out.println(k);
//		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
