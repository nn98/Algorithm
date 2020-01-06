package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1365_C {
	static int n,s=1,i=0,a[]=new int[100000];
	static void o(int n) {
		int f=0,t=s,m;
		if(a[s-1]<n) {
			a[s++]=n;
			return;
		}
		while(s<=t) {
			m=(f+t)/2;
			if(a[m]<n)s=m+1;
			else t=m-1;
		}
		a[t+1]=n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(f.readLine());
		StringTokenizer t=new StringTokenizer(f.readLine());
		a[i++]=Integer.parseInt(t.nextToken());
		for(;i++<n;)o(Integer.parseInt(t.nextToken()));
		System.out.print(n-s);
	}
}