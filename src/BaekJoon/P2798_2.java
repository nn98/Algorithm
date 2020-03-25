package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798_2 {
	static int n,m,a[],r,i;
	static void o(int x,int v,int c) {
//		System.out.println(v+" "+c);
		if(c==3)if(v<=m)r=r>v?r:v;
		if(v>m||r==m||x==n)return;
		else {
		o(x+1,v+a[x],c+1);
		o(x+1,v,c);
		}
	}
	public static void main(String[]z)throws Exception{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(b.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n];
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		o(0,0,0);
		System.out.print(r);
	}
}
