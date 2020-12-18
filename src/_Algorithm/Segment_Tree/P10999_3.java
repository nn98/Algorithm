package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.*;
public class P10999_3{
	
	static int N,m,l,h,i,x,y,z;
	
	static long a[],b[],A[];
	
	static void u() {
		
//		노드의 범위 계산?
		
		for(;i>1;i/=2,a[i]=a[i*2]+a[i*2+1]);
		
	}
	
//	업데이트 범위?
	
	static void t(int n,int s,int e) {
		if(s==e) {
			if(s-l-1>N)a[n]=0;
			else a[n]=A[s-l-1];
			return;
		}
		int m=(s+e)/2;
		t(n*2,s,m);
		t(n*2+1,m+1,e);
	}
	
	static void l(int n,int s,int e) {
		if(b[n]!=0) {
			a[n]+=(e-s+1)*b[n];
			if(s!=e) {
				b[n*2]+=b[n];
				b[n*2+1]+=b[n];
			}
			b[n]=0;
		}
	}
	
	static long p(int n,int s,int e) {
		
		l(n,s,e);
		
		if(x>e|y<s)return 0;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
		
	}
	
	static void o(int n,int s,int e) {
		
		l(n,s,e);
		
		if(y<s|x>e)return;
		
		if(x<=s&e<=y){
			a[n]+=(e-s+1)*z;
			if(s!=e) {
				b[n*2]+=z;
				b[n*2+1]+=z;
			}
			return;
		}
		int m=(s+e)/2;
		o(n*2,s,m);
		o(n*2+1,m+1,e);
		a[n]=a[n*2]+a[n*2+1];
		
	}
	public static void main(String[] args)throws Exception{
		
//		업데이트에서 구간 노드를 업데이트
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		N=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		for(l=2;l<N;l*=2);
		a=new long[l*2];
		b=new long[l*2];
		A=new long[N+1];
//		while(i<N)a[l+i++]=Integer.parseInt(r.readLine());
		while(i<N)A[++i]=Integer.parseInt(r.readLine());
		t(1,l,l*2-1);
//		for(h=0;h<N;i=l+h,u(),h++);
//		for(h=1;h<=N;A[h])
		while(m-->0) {
//			w.write(m+":\n");
//			for(int Q=0;Q<l*2;w.write(a[Q]+"\t"),Q++);
//			w.write("\n");
//			for(int Q=0;Q<l*2;w.write(b[Q]+"\t"),Q++);
//			w.write("\n");
			t=new StringTokenizer(r.readLine());
			switch(t.nextToken()) {
			case "1":
				x=Integer.parseInt(t.nextToken());
				y=Integer.parseInt(t.nextToken());
				z=Integer.parseInt(t.nextToken());
//				for(;x<=y;x++) {
//					a[l+x-1]+=z;
//					i=x+l-1;
//					u();
//				}
//				if(y%2==1)u();
				o(1,1,l);
				break;
			case "2":
				x=Integer.parseInt(t.nextToken());
				y=Integer.parseInt(t.nextToken());
				w.write(""+p(1,1,l)+"\n");
				break;
			}
		}
		w.flush();
	}
	
}