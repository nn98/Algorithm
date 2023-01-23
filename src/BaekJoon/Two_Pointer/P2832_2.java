package BaekJoon.Two_Pointer;

import java.io.*;
import java.util.*;

public class P2832_2 {
	static int n,a[],i,j=1,k=1,p,U,f[];
	static int l(int x) {return x&(-x);}
	static void u(int x,int d) {
		while(x<n) {
			f[x]+=d;
			x+=l(x);
		}
	}
	static int s(int x) {
		int r=0;
		while(x>0) {
			r+=f[x];
			x-=l(x);
		}
		return r;
	}
	static void S() {
		int i=n,u,t;
		for(;i>0;i--) {
			u=a[i];
			t=s(n)-s(u);
			U+=t;
			u(u,-1);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		a=new int[n+1];
		f=new int[n+1];
		for(;++i<=n;a[i]=Integer.parseInt(t.nextToken()));
		System.out.println(Arrays.toString(a));
		for(;++k<=n;) {
			System.out.println("k: "+k+" j: "+j);
			if(a[k-1]<a[k]) {
				for(i=k-1;i>=j;p=a[i],a[i]=a[j],a[j]=p,i--,j++);
				j=k;
				U++;
			}
		}
		System.out.println(Arrays.toString(a));
		for(i=0;++i<=n;u(i,1));
		S();
		System.out.println(U);
	}
}
