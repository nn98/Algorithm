package _Algorithm.Sweeping;
import java.io.*;
import java.util.*;

public class P2104_5 {
	static int n,m,i,k,a[],s[];
	static long R,w,e,h,u[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine())+1;
		a=new int[n+1];
		u=new long[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;++i<n;) {
			a[i]=Integer.parseInt(t.nextToken());
			u[i]=u[i-1]+a[i];
		}
		a[n]=0;
		s=new int[n];
		for(i=1;i<=n;i++) {
			while(a[s[m]]>=a[i]) {
				int h=a[s[m--]];
//				System.out.println(i+" "+m+" "+w);
				if(m<0)break;
				long v=h*(u[i-1]-u[s[m]]);
				if(w<v)w=v;
			}
			s[++m]=i;
		}
		System.out.println(w);
	}
}