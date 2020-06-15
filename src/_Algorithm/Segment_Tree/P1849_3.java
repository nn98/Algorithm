package _Algorithm.Segment_Tree;

import java.io.*;

public class P1849_3 {
	static int n,m,i,j,a[],t[],x,e,p;
	static void u() {
		x=j+i-1;
		t[x]=m;
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static int f(int x,int v) {
		if(x>=j)return x-j+1;
		int p=t[x*2];
		if(v<p)return f(x*2,v);
		return f(x*2+1,v-p);
	}
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n+1];
		for(i=1;i<n*2;i*=2);
		t=new int[i];
		j=i/2;
		m=1;
		for(i=0;i++<n;)u();
		m=0;
		for(;e++<n;) {
			p=Integer.parseInt(r.readLine());
			i=f(1,p);
			a[i]=e;
			u();
		}
		for(i=0;i++<n;w.write(a[i]+"\n"));
		w.flush();
	}
}
