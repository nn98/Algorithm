package BaekJoon.LIS;
import java.io.*;
import java.util.*;

public class P1818 {
	static int n,m,i,j,a[],h[];
	static void o(int x) {
		for(int i=x;++i<n;) {
			if(a[i]>a[x])h[x]=Math.max(h[x],h[i]);
		}
		h[x]++;
		m=m>h[x]?m:h[x];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		h=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(;i-->0;o(i));
		System.out.println(n-m);
	}

}