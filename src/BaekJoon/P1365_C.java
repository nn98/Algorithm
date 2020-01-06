package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1365_C {

	static int a[],s=1;
	static int o(int n) {
		int l=0,h=s-1;
		while(l<h) {
			int m=(l+h)/2;
			if(a[m]>=n)
				h=m;
			else
				l=m+1;
		}
		return h;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,i=0;
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(f.readLine());
		a=new int[n];
		StringTokenizer t=new StringTokenizer(f.readLine());
		for(;i<n;i++) {
			int v=Integer.parseInt(t.nextToken());
			if(v>a[s-1]) {
				a[s++-1]=v;
			}
			else a[o(v)]=v;
		}
		System.out.print(n-s+1);
	}

}
