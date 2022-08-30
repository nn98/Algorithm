package _Algorithm.BFS;
import java.util.*;
import java.io.*;
public class P21738_2 {
	static int n,m,p,i,x,y,h[],R;
	static List<Integer>l[];
	static Queue<Integer>q=new LinkedList();
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		p=Integer.parseInt(t.nextToken());
		h=new int[n+1];
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
		h[p]++;
		for(int x:l[p])q.add(x);
		y=0;
		while(R<2) {
			x=q.remove();
			System.out.println("\t"+x);
			y++;
			if(x<m)R++;
			h[x]++;
			for(int a:l[x])if(h[a]<1)q.add(a);
		}
		System.out.println(y);
	}
}
