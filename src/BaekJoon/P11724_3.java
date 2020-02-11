package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11724_3 {
	static int n,m,r=0,x=0,y;
	static boolean h[],a[][];
	static void o(int i,boolean c,int f) {
		if(i==f) {
			r+=c?1:0;
			return;
		}
		if(h[i])c=false;
		else h[i]=true;
		for(int k=0;k<n;k++)if(a[i][k])o(k,c,i);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new boolean[n][n];
		h=new boolean[n];
		for(;m-->0;);
	}
}