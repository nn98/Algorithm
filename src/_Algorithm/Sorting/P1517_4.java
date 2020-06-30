package _Algorithm.Sorting;

import java.io.*;

public class P1517_4 {
	static int n,i,j,p,q,a[],b[],c;
	static long r=0;
	static void o(int s,int e) {
		if(s<e) {
			int m=(s+e)/2;
			o(s,m);
			o(m+1,e);
			m(s,e,m);
		}
	}
	static void m(int s,int e,int m) {
		i=s;
		j=m+1;
		p=q=c=0;
		while(i<=m|j<=e) {
			if(i>m) {
				b[p]=a[j++];
				c++;
			}else if(j>e) {
				b[p]=a[i++];
				r+=c;
			}else if(a[i]<=a[j]) {
				b[p]=a[i++];
				r+=c;
			}else{
				b[p]=a[j++];
				c++;
			}
			p++;
		}
		while(s<=e)a[s++]=b[q++];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(R.readLine());
		a=new int[n];
		b=new int[n];
		for(String s:R.readLine().split(" "))a[i++]=Integer.parseInt(s);
		o(0,n-1);
		System.out.println(r);
	}

}