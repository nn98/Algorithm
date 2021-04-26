package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.StringTokenizer;
public class P2243{
	static int n,m,i,j,p,M=1000001,a[]=new int[M*4];
	static void o(int n,int t,int d,int s,int e) {
		if(t<s|t>e)return;
		a[n]+=d;
		if(s==e)return;
		int m=(s+e)/2;
		o(n*2,t,d,s,m);
		o(n*2+1,t,d,m+1,e);
	}
	static int q(int n,int t,int s,int e) {
		if(s==e)return s;
		int m=(s+e)/2;
		if(t<=a[n*2])return q(n*2,t,s,m);
		return q(n*2+1,t-a[n*2],m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		while(n-->0) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			m=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			switch(m) {
			case 1:
				m=q(1,i,1,M);
				w.write(m+"\n");
				o(1,i,-1,1,M);
				break;
			case 2:
				o(1,i,Integer.parseInt(t.nextToken()),1,M);
			}
		}
		w.flush();
	}
}