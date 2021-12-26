package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P15971 {
	static int n,x,y,i,j,k,p,a[],b[][];
	static List<Integer>l;
	static void o(int x) {
		System.out.println(l);
		if(x==y|k==0) {
			k=0;
			return;
		}
		a[x]++;
		for(int i=0;++i<n;) {
			if(b[x][i]>0&a[i]<1) {
				l.add(b[x][i]);
				o(i);
				if(k>0)l.remove(l.size()-1);
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
		for(;++k<n-1;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			p=Integer.parseInt(t.nextToken());
			b[i][j]=b[j][i]=p;
		}
		o(x);
		System.out.println(l);
		p=i=0;
		j=l.size()-1;
		while(i<j) {
			if(l.get(i)<l.get(j))
				p+=l.remove(i);
			else
				p+=l.remove(j);
		}
		System.out.println(p);
	}
}