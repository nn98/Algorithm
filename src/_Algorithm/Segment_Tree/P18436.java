package _Algorithm.Segment_Tree;
// https://www.acmicpc.net/problem/18436
// 수열과 쿼리 37
import java.io.*;
import java.util.*;
public class P18436 {
	static int n,m,k,i,j,l,a[],c[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1],c[j]=c[j*2]+c[j*2+1]);
	}
	static int p(int n,int x,int y) {
		if(y<j|x>i)return 0;
		if(j<=x&y<=i)return a[n];
		int m=(x+y)/2;
		return p(n*2,x,m)+p(n*2+1,m+1,y);
	}
	static int q(int n,int x,int y) {
		if(y<j|x>i)return 0;
		if(j<=x&y<=i)return c[n];
		int m=(x+y)/2;
		return q(n*2,x,m)+q(n*2+1,m+1,y);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(l=1;l<n;l*=2);
		a=new int[l*2];
		c=new int[l*2];
		Arrays.fill(a,l,l*2,-1);
		Arrays.fill(c,l,l*2,-1);
		for(;i<n;j=i+++l,c[j]=Integer.parseInt(t.nextToken())%2,a[j]=c[j]==1?0:1,j/=2,
				a[j]=(a[j*2]==0?1:0)+(a[j*2+1]==0?1:0),
						c[j]=(c[j*2]==1?1:0)+(c[j*2+1]==1?1:0),o());
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(c));
		for(m=Integer.parseInt(r.readLine());m-->0;) {
			t=new StringTokenizer(r.readLine());
			k=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			if(k<2) {
				j+=l-1;
				i%=2;
				c[j]=i;
				a[j]=c[j]==1?0:1;
//				j/=2;
//				a[j]=(a[j*2]==0?1:0)+(a[j*2+1]==0?1:0);
//				c[j]=(c[j*2]==1?1:0)+(c[j*2+1]==1?1:0);
				o();
//				System.out.println(Arrays.toString(a));
			}else w.write((k<3?p(1,1,l):q(1,1,l))+"\n");
		}
		w.flush();
	}
}