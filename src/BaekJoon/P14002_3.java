package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14002_3 {

	static int[]h;
	static int o(int t,int k) {
		int f=0;
		while(f<t) {
			int m=(f+t)/2;
			if(h[m]>=k)t=m;
			else f=m+1;
		}
		return t;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),i=0,a[]=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		h=new int[n];
		h[0]=a[0];
		int j=0;
		for(i=1;i<n;i++) {
//			System.out.println(a[i]);
			if(h[j]<a[i])h[++j]=a[i];
			else {
				int s=o(j,a[i]);
				h[s]=a[i];
			}
		}
		System.out.println(j+1);
		for(int k:h)if(k!=0)System.out.print(k+" ");
	}
}
/*
11
3 4 7 5 2 6 3 4 5 7 9
*/