package _Algorithm.Prefix_Sum;

import java.io.*;
import java.util.*;

public class P11659 {
	static int n,m,l=1,a[],i,j;
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
//	static int p(int n,int s,int e) {
//		
//	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		for(;l<n;l*=2);
		a=new int[l*2];
		t=new StringTokenizer(r.readLine());
		for(;i<n;j=i+++l,a[j]=Integer.parseInt(t.nextToken()),o());
		System.out.println(Arrays.toString(a));
	}

}
