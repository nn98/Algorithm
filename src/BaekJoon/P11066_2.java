package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class P11066_2 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m,a[],h[],i,j;
		for(;n-->0;) {
			m=Integer.parseInt(r.readLine());
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[m];
			for(i=0;i<m;a[i++]=Integer.parseInt(t.nextToken()));
		}
	}
}