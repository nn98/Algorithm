package _Algorithm.Sorting;
// 걍 사이즈늘려서 돌리면 똑같나

import java.util.Scanner;

public class P7578_4 {

	static int n,i,j=500001,p,q,c,a[]=new int[j],b[]=new int[j],A[]=new int[1000001];
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
			}else {
				b[p]=a[j++];
				c++;
			}
			p++;
		}
		while(s<=e)a[s++]=b[q++];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i<n;A[s.nextInt()]=++i);
		for(i=0;i<n;a[i]=A[s.nextInt()]);
		o(0,n-1);
		System.out.println(r);
	}

}
