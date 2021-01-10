package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P5676 {

	static int n,m,a[],l,i,j,x,y,F;
	static void o() {
//		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
		for(;j>1&F>0;) {
			j/=2;
			x=a[j*2]==0?0:(a[j*2]>0?1:-1);
			y=a[j*2+1]==0?0:(a[j*2+1]>0?1:-1);
			a[j]=x*y;
			if(a[j]==0)F=0;
		}
		for(;j>1&F==0;j/=2,a[j]=0);
	}
	static int p(int n,int s,int e) {
		if(F==0)return 0;
		if(s>y|x>e)return 1;
		if(s<=x&y<=e) {
			if(a[n]==0)F=0;
			return a[n];
		}
		int m=(s+e)/2;
		return p(n*2,s,m)*p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken());
			m=Integer.parseInt(t.nextToken());
			for(l=1;l<n;l*=2);
			a=new int[l*2];
			t=new StringTokenizer(r.readLine());
			Arrays.fill(a,1);
			for(i=0;i<n;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),F=1,o());
			System.out.println(Arrays.toString(a));
			while(m-->0) {
				System.out.println(m);
				t=new StringTokenizer(r.readLine());
				if(t.nextToken().equals("C")) {
					j=Integer.parseInt(t.nextToken())+l-1;
					a[j]=Integer.parseInt(t.nextToken());
					F=1;
					o();
					System.out.println(Arrays.toString(a));
				}else {
					F=1;
					x=Integer.parseInt(t.nextToken());
					y=Integer.parseInt(t.nextToken());
					i=p(1,1,n);
					w.write(F==0?"0":"");
					if(F>0)
						w.write(i>0?"+":"-");
				}
			}
			w.flush();
		}
	}

}