package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.StringTokenizer;
public class P2243 {
	static int n,m,i,j,p,a[];
	static void o() {
		for(;i>1;i/=2,a[i]=a[i*2]+a[i*2+1]);
	}
	static int p(int n,int s,int e) {
		return 0;
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
			switch(t.nextToken()) {
			case "1":
				break;
			case "2":
				
			}
		}
	}
}