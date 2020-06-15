package _Algorithm.Segment_Tree;
//https://www.acmicpc.net/blog/view/9
import java.io.*;
import java.util.*;
public class Segment_Tree {

	static int n,m,h,i,j,a[],t[];
	static int o(int n,int s,int e) {
		System.out.println(n+" "+s+" "+e+" "+Arrays.toString(t));
		if(s==e)return t[n]=a[s];
		else {
			int m=(s+e)/2;
			return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
		}
//		int m=(s+e)/2;
//		return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	static int u(int n,int s,int e,int l,int r) {
		if(l>e||r<s)return 0;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m,l,r)+u(n*2+1,m+1,e,l,r);
	}
	static void p(int n,int s,int e,int x,int d) {
		if(x<s||x>e)return;
		t[n]=t[n]+d;
		if(s!=e) {
			int m=(s+e)/2;
			p(n*2,s,m,x,d);
			p(n*2+1,m+1,e,x,d);
		}
	}
	public static void main(String[] args)throws Exception{
//		System.out.println(Math.round(Math.log(n)));
//		System.out.println(Math.pow(2,Math.round(Math.log(n))+1)-1);
//		t=new long[(int)Math.round(Math.pow(2,Math.round(Math.log(n))+1)-1)];
//		t=new long[(int)(2*n-1)];
//		세상에 자바엔 log2가 없대! 시발
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s=new StringTokenizer(r.readLine());
		
		n=Integer.parseInt(s.nextToken());
		m=Integer.parseInt(s.nextToken())+Integer.parseInt(s.nextToken());
		a=new int[n];
//		높이와 노드 개수 구하는 공식
//		인데 시벌 난 왜 안되냐
//		h=Math.round(Math.round(Math.log(n)/Math.log(2)));
//		i=(1<<(h+1));
//		System.out.println(i);
//		내방식대로
		for(i=1;i<n;i*=2);
		i*=2;
		System.out.println(i);
		t=new int[i];
		
//		System.out.println(i);
		for(i=0;i<n;a[i++]=Integer.parseInt(r.readLine()));
		o(1,0,n-1);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(t));
		for(;m-->0;) {
			s=new StringTokenizer(r.readLine());
			if(s.nextToken().equals("1")) {
				int x=Integer.parseInt(s.nextToken())-1,d=Integer.parseInt(s.nextToken())-a[x];
				p(1,0,n-1,x,d);
				System.out.println(Arrays.toString(t));
			}else {
				System.out.println("\t"+u(1,0,n-1,Integer.parseInt(s.nextToken())-1,Integer.parseInt(s.nextToken())-1));
			}
		}
//		o(0,0,(int)m-1);
	}

}