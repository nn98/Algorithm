package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14501 {

	static int n,a[],b[],h[],i=0;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		b=new int[n];
		h=new int[n];
		for(;i<n;i++) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			a[i]=Integer.parseInt(t.nextToken());
			b[i]=Integer.parseInt(t.nextToken());
		}
	}
}