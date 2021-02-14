package _Algorithm.Segment_Tree;

import java.util.*;
import java.io.*;

public class P15560 {

	static int N,m,l,i,j,u,v,a[],R,E,T,F;
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static int p(int n,int s,int e) {
//		System.out.println("P: "+n+" "+s+" "+e+" "+R);
		if(i>e|j<s)return 0;
		if(i<=s&e<=j) {

			if(e>F)
				E=u*a[n]+v*(F-s);
			else 
				E=u*a[n]+v*(e-s);
			R=R>E?R:E;

		return a[n];
		}
		int m=(s+e)/2;
		E=p(n*2,s,m)+p(n*2+1,m+1,e);
		if(e>F) {
			T=u*E+v*(F-s);
//			System.out.println(String.format("%d * %d + %d * (%d - %d)\n", u,E,v,F,s));
		}else {
			T=u*E+v*(e-s);
//			System.out.println(String.format("%d * %d + %d * (%d - %d)\n", u,E,v,e,s));
		}
		R=R>T?R:T;
		return E;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		F=N=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		u=Integer.parseInt(t.nextToken());
		v=Integer.parseInt(t.nextToken());
		for(l=1;l<N;l*=2);
		a=new int[l*2];
		t=new StringTokenizer(r.readLine());
		for(;i<N;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),o());
		for(;m-->0;) {
//			System.out.println(Arrays.toString(a));
			t=new StringTokenizer(r.readLine());
			N=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			switch(N) {
			case 0:
				p(1,1,l);
//				System.out.println(R);
				w.write(R+"\n");
				R=0;
				break;
			default:
				N=l+i-1;
				a[N]=j;
				j=N;
				o();
			}
		}
		w.flush();
	}

}
