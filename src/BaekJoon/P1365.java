package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1365 {

	//LIS 최장증가부분수열
	//LIS만보고 알았어야;
	static int n,a[],h[],i=0,r;
	static void o(int x,int v) {
		h[x]=v;
		r=h[x]>r?h[x]:r;
		for(int j=x+1;j<n;j++) {
			if(a[j]>a[x]&&h[j]<=v) {
				o(j,v+1);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(f.readLine());
		a=new int[n];
		h=new int[n];
		StringTokenizer t=new StringTokenizer(f.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(i=0;i<n;i++)if(h[i]<1)o(i,1);
		System.out.print(n-r);
	}
}