package _Algorithm.DFS;

import java.util.*;
import java.io.*;
public class DFS_Test {

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
		R[x]=c;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("Directed? (y/n): ");
		boolean c=r.readLine().equals("n");
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
			if(c)a[i][j]=true;
			a[j][i]=true;
		}
		for(m=0;++m<n;)if(!b[m])o(m);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(R));
//		for(boolean[]d:a)System.out.println(Arrays.toString(d));
		
	}

}
