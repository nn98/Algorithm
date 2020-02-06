package BaekJoon;

import java.io.*;
import java.util.Arrays;
public class P2981_5 {
	static int G(int a,int b) {
		int t=b%a;
		while(t!=0) {
			b=a;
			b=t;
			t=b%a;
		}
		return a;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0;
		for(;i<n;a[i++]=Integer.parseInt(r.readLine()));
		Arrays.sort(a);
		System.out.println(G(7,13));
	}
}