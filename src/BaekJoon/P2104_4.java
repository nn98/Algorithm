package BaekJoon;

import java.io.*;
import java.util.*;

public class P2104_4 {

	static int n,a[],R,i,j;
	static void o(int f,int t) {
		System.out.println(f+" "+t);
		if(t<f)return;
		if(f==t)R=R>a[f]?R:a[f];
		else {
			int m=a[f],v=m,l=t-f+1,i=f,j=f;
			for(;i++<t;) {
				v+=a[i];
				if(a[i]<m) {
					j=i;
					m=a[i];
				}
			}
			v*=m;
			R=R>v?R:v;
				o(f,j-1);
				o(j+1,t);
		}

	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		System.out.println(Arrays.toString(a));
		o(0,n-1);
		System.out.println(R);
	}

}
