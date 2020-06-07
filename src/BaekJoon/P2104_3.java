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
			R=R>v?R:v;
				o(f,j-1);
				o(j+1,t);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[(n+1)*n/2+n%2==0?0:n/2+1];
		System.out.println();
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;i++) {
//			V[i][i]=a[i]=Integer.parseInt(t.nextToken());
//			if(i==0)continue;
//			for(j=i;j>=0;V[j][i]=V[j--][i-1]+a[i]);
		}
		o(0,n-1);
		System.out.print(R);
	}

}