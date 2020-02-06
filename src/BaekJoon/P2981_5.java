package BaekJoon;

import java.io.*;
import java.util.Arrays;
public class P2981_5 {
	static int G(int a,int b) {
		int t;
		if(a>b) {
			t=a;
			a=b;
			b=t;
		}
		t=b%a;
		while(t!=0) {
			b=a;
			a=t;
			t=b%a;
		}
		return a;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0,c,v=0;
		for(;i<n;a[i++]=Integer.parseInt(r.readLine()));
		Arrays.sort(a);
		for(i=1;i<n;a[i-1]=a[i]-a[i++-1]);
//		System.out.println(Arrays.toString(a));
		if(n==2)v=a[0];
		for(i=1;i<n-1;c=G(a[i-1],a[i]),v=v>c?v:c,i++);
		boolean[]b=new boolean[v+1];
		for(i=0;i++<v/2;b[i]=b[v/i]=v%i==0);
//		System.out.println(Arrays.toString(b));
//		System.out.println(v);
		for(i=1;++i<=v;System.out.print(b[i]?i+" ":""));
	}
}