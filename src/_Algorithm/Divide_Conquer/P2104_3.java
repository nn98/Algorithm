package _Algorithm.Divide_Conquer;
//에이 시발 머리 존나 똑똑해야되네
//?
import java.io.*;
import java.util.*;
public class P2104_3 {

	static int n,a[],i,R,j,k,m,p,b[];
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
		b=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;i++,k--) {
			b[i]=m;
			a[m]=Integer.parseInt(t.nextToken());
			p=k;
			for(j=m-p;j>0;a[j]=a[m]+a[j-1],j-=++p);
			m+=k;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		o(0,n-1);
		System.out.print(R);
	}
}
