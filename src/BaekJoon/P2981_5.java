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
		System.out.println(Arrays.toString(a));
		for(i=1;i<n-1;c=G(a[i-1],a[i]),v=v>c?v:c,i++);
		System.out.println(v);
	}
}