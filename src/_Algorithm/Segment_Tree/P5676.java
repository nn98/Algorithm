package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P5676 {

	static int n,m,a[],l,i,j,x,y;
	static void o() {
//		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
		for(;j>1;) {
			j/=2;
			x=a[j*2]==0?0:(a[j*2]>0?1:-1);
			y=a[j*2+1]==0?0:(a[j*2+1]>0?1:-1);
			a[j]=x*y;
		}
	}
	static int p(int n,int s,int e) {
//		System.out.println(n+" "+s+" "+e);
		if(s>y|x>e)return 1;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)*p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer t;
		while((s=r.readLine())!=null) {
			t=new StringTokenizer(s);
			n=Integer.parseInt(t.nextToken());
			m=Integer.parseInt(t.nextToken());
			for(l=1;l<n;l*=2);
			a=new int[l*2];
			t=new StringTokenizer(r.readLine());
			Arrays.fill(a,1);
			for(i=0;i<n;j=l+i++,x=Integer.parseInt(t.nextToken()),a[j]=(x==0?0:(x>0)?1:-1),F=1,o());
//			System.out.println(Arrays.toString(a));
			while(m-->0) {
				System.out.println(Arrays.toString(a));
				t=new StringTokenizer(r.readLine());
				if(t.nextToken().equals("C")) {
					j=Integer.parseInt(t.nextToken())+l-1;
					i=Integer.parseInt(t.nextToken());
					a[j]=i>0?1:-1;
					if(i==0)a[j]=i;
					F=1;
					o();
//					System.out.println(Arrays.toString(a));
				}else {
					F=1;
					x=Integer.parseInt(t.nextToken());
					y=Integer.parseInt(t.nextToken());
					long X=p(1,1,l);
//					w.write(F==0?"0":"");
//					if(F>0)w.write(i>0?"+":"-");
					w.write((X==0)?"0":(X>0?"+":"-"));
				}
			}
			w.flush();
		}
	}

}