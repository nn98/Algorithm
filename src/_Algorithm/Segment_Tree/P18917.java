package _Algorithm.Segment_Tree;
//https://www.acmicpc.net/problem/18436
//수열과 쿼리 37
import java.io.*;
import java.util.*;
public class P18917 {
	static int n,m,k,i,j,l,a[],b[];
	static void o() {
		for(;j>1;j/=2,a[j]=b[a[j*2]]>b[a[j*2+1]]?a[j*2+1]:a[j*2]);
	}
	static int p(int n,int x,int y) {
		if(y<j|x>i)return 0;
		if(j<=x&y<=i)return a[n];
		int m=(x+y)/2,l=p(n*2,x,m),r=p(n*2+1,m+1,y);
		return b[l]>b[r]?r:l;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(l=1;l<n;l*=2);
		a=new int[l*2];
		b=new int[l+1];
	}

}
