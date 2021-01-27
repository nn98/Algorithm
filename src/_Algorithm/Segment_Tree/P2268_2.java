package _Algorithm.Segment_Tree;

//의외의 복병도
//그지같은 함정도

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2268_2 {

	static int n,m,i,j,x,y,l;
	static long a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static long p(int n,int s,int e) {
		if(s>y|x>e)return 0;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		for(l=1;l<n;l*=2);
		a=new long[l*2];
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			x=Integer.parseInt(t.nextToken());
			if(x>0) {
				a[j=Integer.parseInt(t.nextToken())-1+l]=Integer.parseInt(t.nextToken());;
				o();
			}else {
				x=Integer.parseInt(t.nextToken());;
				y=Integer.parseInt(t.nextToken());;
				if(x>y) {
					j=x;
					x=y;
					y=j;
				}
				w.write(p(1,1,l)+"\n");
			}
		}
		w.flush();
	}

}