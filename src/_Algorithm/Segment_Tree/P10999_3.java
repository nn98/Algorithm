package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.*;
public class P10999_3{
	
	static int n,m,l,h,i,x,y,z;
	
	static long a[],b[];
	
	static void u() {
		
		노드의 범위 계산?
		
		for(;i>1;i/=2,a[i]=a[i*2]+a[i*2+1]);
		
	}
	
//	업데이트 범위?
	
	static long p(int n,int s,int e) {
		
		if(b[n]!=0) {
			a[n]+=(y-x+1)*b[n];
			if(x!=y) {
				b[n*2]+=b[n];
				b[n*2+1]+=b[n];
			}
			b[n]=0;
		}
		
		if(x>e|y<s)return 0;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
		
	}
	
	static void o(int n,int s,int e) {
		
		if(b[n]!=0) {
			a[n]+=(y-x+1)*b[n];
			if(x!=y) {
				b[n*2]+=b[n];
				b[n*2+1]+=b[n];
			}
			b[n]=0;
		}
		
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
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		for(l=2;l<n;l*=2);
		a=new long[l*2];
		b=new long[l*2];
		while(i<n)a[l+i++]=Integer.parseInt(r.readLine());
		for(h=0;h<n;i=l+h,u(),h++);
		while(m-->0) {
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