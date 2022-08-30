package _Algorithm.BFS;
import java.util.*;
import java.io.*;
public class P21738_2 {
	static int n,m,p,i,x,y,h[],R[];
	static List<Integer>l[];
	static Queue<Integer>q=new LinkedList();
	static void o(int x,int d) {
//		System.out.println(y+" "+x);
		if(x==p) {
//			System.out.println("\t"+y+" "+x+" "+d);
			R[y]=d;
		}
		if(R[y]<1) {
			h[x]++;
			for(int a:l[x])if(h[a]<1)o(a,d+1);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		p=Integer.parseInt(t.nextToken());
		h=new int[n];
		R=new int[m+1];
		l=new List[n];
		for(;++i<n-1;) {
			t=new StringTokenizer(r.readLine());
			x=Integer.parseInt(t.nextToken());
			y=Integer.parseInt(t.nextToken());
			if(l[x]==null)l[x]=new ArrayList();
			l[x].add(y);
			if(l[y]==null)l[y]=new ArrayList();
			l[y].add(x);
		}
		for(y=0;y++<m;o(y,1));
		System.out.println(Arrays.toString(R));
		Arrays.sort(R);
		System.out.println(n-(R[1]+R[2]-1));
//		h[p]++;
//		for(int x:l[p])q.add(x);
//		y=0;
//		while(R<2) {
//			x=q.remove();
//			System.out.println("\t"+x);
//			y++;
//			if(x<m)R++;
//			h[x]++;
//			for(int a:l[x])if(h[a]<1)q.add(a);
//		}
//		System.out.println(y);
	}
}
