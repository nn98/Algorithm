package _Algorithm.BFS;
import java.util.*;
import java.io.*;
public class P21738_2 {
	static int n,m,p,i,x,y,h[],r;
	static List<Integer>l[];
	static Queue<Integer>q=new LinkedList();
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		p=Integer.parseInt(t.nextToken());
		l=new List[n+1];
		for(;++i<n;) {
			t=new StringTokenizer(r.readLine());
			x=Integer.parseInt(t.nextToken());
			y=Integer.parseInt(t.nextToken());
			if(l[x]==null)l[x]=new ArrayList();
			l[x].add(y);
			if(l[y]==null)l[y]=new ArrayList();
			l[y].add(x);
		}
	}

}
