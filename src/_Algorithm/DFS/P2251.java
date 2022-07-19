package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P2251 {
	static int n,m,i,j,r,w[]=new int[3],h[][]=new int[201][201];
	static List<Integer>l=new ArrayList();
	static void o(int a,int b,int c) {
		if(h[a][b]>0)return;
		if(a==0)l.add(c);
		h[a][b]++;
		if(a+b>w[0])o(w[0],a+b-w[0],c);
		else o(a+c,b,0);
		if(c+b>w[1])o(a,w[1],b+c-w[1]);
		else o(a,b+c,0);
		o(a,0,b+c);
		o(0,b,a+c);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;w[i++]=Integer.parseInt(t.nextToken()));
	}
}