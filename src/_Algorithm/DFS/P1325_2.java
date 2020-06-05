package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_2 {
	static int n,m,i,j,R[];
	static boolean[]a[],b;
	static void o(int x) {
		b[x]=true;
		int c=1,k=0;
		for(;++k<n;) {
			if(a[x][k]) {
				if(!b[k])o(k);
				c+=R[k];
			}
		}
		m=m>c?m:c;
		R[x]=c;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new boolean[n][n];
		b=new boolean[n];
		R=new int[n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[j][i]=true;
		}
		for(i=0;++i<n;)if(!b[i])o(i);
//		for(boolean[]d:a)System.out.println(Arrays.toString(d));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(R));
		for(i=0;++i<n;System.out.print(R[i]==m?i+" ":""));
	}

}
