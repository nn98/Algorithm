package BaekJoon.DFS;
import java.util.*;
import java.io.*;
public class P13265_3{
	static int u,n,m,a[][],v[],i,j,R;
	static void o(int x,int c) {
//		System.out.println(x+" "+c);
		v[x]++;
		a[x][0]=c;
		for(int i=0;++i<n&R<1;) {
			if(i==x)continue;
			if(a[x][i]>0) {
				if(c==0) {
					c=a[i][0]>1?1:2;
					a[x][0]=c;
				}
				R=a[x][0]!=a[i][0]?0:1;
				if(v[i]<1&R<1)o(i,c>1?1:2);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		u=Integer.parseInt(r.readLine());
		StringTokenizer t;
		for(;u-->0;) {
			t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken())+1;
			m=Integer.parseInt(t.nextToken());
			a=new int[n][n];
			v=new int[n];
			for(;m-->0&R<1;) {
				t=new StringTokenizer(r.readLine());
				i=Integer.parseInt(t.nextToken());
				j=Integer.parseInt(t.nextToken());
				a[i][j]=a[j][i]=1;
			}
			for(i=0;++i<n&R<1;)if(v[i]<1)o(i,0);
//			for(int[]b:a)System.out.println(Arrays.toString(b));
			System.out.println(R<1?"possible":"impossible");
			R=0;
		}
	}
}