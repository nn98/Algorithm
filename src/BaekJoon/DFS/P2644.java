package BaekJoon.DFS;
import java.io.*;
import java.util.*;

public class P2644 {
	static int n,b,m,a[][],i,j,v,R=-1,h[];
	static void o(int i,int c) {
		h[i]++;
		if(i==m) {
			R=c;
			return;
		}
		for(int j=0;++j<n;)if(a[i][j]>0&h[j]<1)o(j,c+1);
	}
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine())+1;
		a=new int[n][n];
		h=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		b=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		v=Integer.parseInt(r.readLine());
		for(;v-->0;t=new StringTokenizer(r.readLine()),i=Integer.parseInt(t.nextToken()),
				j=Integer.parseInt(t.nextToken()),a[i][j]=a[j][i]=1);
//		for(int[]c:a)System.out.println(Arrays.toString(c));
		o(b,0);
		System.out.println(R);
	}

}
