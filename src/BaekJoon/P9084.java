package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9084 {

	static int n,m,p,a[],h[],i,c;
	static void o(int x,int v) {
		if(v==p)c++;
		else if(v>p)return;
		else if(x==m)return;
		else {
			o(x,v+a[x]);
			o(x+1,v);
			o(x+1,v+a[x]);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		for(n=Integer.parseInt(r.readLine());n-->0;) {
			m=Integer.parseInt(r.readLine());
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[m];
			for(i=0;i<m;a[i++]=Integer.parseInt(t.nextToken()));
			p=Integer.parseInt(r.readLine());
			c=0;
			o(0,0);
			System.out.println(c);
		}
	}
}