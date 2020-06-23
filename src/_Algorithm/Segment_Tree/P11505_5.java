package _Algorithm.Segment_Tree;

import java.util.*;
import java.io.*;

public class P11505_5 {
	static int x,n,m,i,j,k,l,r;
	static long t[],M=1000000007;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]*t[x*2+1]);
	}
	public static void main(String[]Z)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter W=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer z=new StringTokenizer(R.readLine());
		n=Integer.parseInt(z.nextToken());
		m=Integer.parseInt(z.nextToken())+Integer.parseInt(z.nextToken());
		for(i=1;i<n;i*=2);
		j=i;
		t=new long[i*2];
		Arrays.fill(t,-1);
		for(i=0;i<n;x=j+i++,t[x]=Integer.parseInt(R.readLine()),o());
		System.out.println(Arrays.toString(t));
		for(;m-->0;) {
			
		}
	}
}