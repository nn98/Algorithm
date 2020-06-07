package BaekJoon;
import java.io.*;
import java.util.*;
public class P2104_3 {

	static int n,a[],i,R,j,k,m;
	static void o(int f,int t) {
		if(t==f)R=R>a[f]*a[f]?R:a[f]*a[f];
		else if(t>f) {
			int i=f,j=f,l=t-f+1,m=a[f],v;
			for(;i++<t;) {
				if(a[i]<m) {
					j=i;
					m=a[i];
				}
			}
//			v=V[f][t]*m;
//			R=R>v?R:v;
				o(f,j-1);
				o(j+1,t);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		k=n=Integer.parseInt(r.readLine());
		a=new int[n*(n+1)/2];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;i++,k--) {
			m=n*i-i+1;
			a[m]=Integer.parseInt(t.nextToken());
			for(j=m-k;j>0;a[j]=a[m]+a[j-1]);
		}
		m=n-1;
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			if(i==m) {
				System.out.println();
				m+=m-1;
			}
		}
		o(0,n-1);
		System.out.print(R);
	}
}
