package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P15971 {
	static int n,x,y,i,j,k,p,a[],b[][];
	static List<Integer>l;
	static void o(int x) {
		if(x==j|k==0)return;
		a[x]++;
		for(int i=0;++i<n;) {
			if(b[x][i]>0&a[i]<1) {
				l.add(b[x][i]);
				o(i);
			}
		}
		a[x]--;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		x=Integer.parseInt(t.nextToken());
		y=Integer.parseInt(t.nextToken());
		a=new int[n];
		b=new int[n][n];
		l=new ArrayList();
		for(;k++<n;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			p=Integer.parseInt(t.nextToken());
			b[i][j]=b[j][i]=p;
		}
		o(i);
		System.out.println(l);
	}
}