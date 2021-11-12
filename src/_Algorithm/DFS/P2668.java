package _Algorithm.DFS;
//BFS
import java.util.*;

public class P2668 {

	static int n,a[],i,j,b[];
	static  List<Integer>l=new ArrayList(),r=new ArrayList();
	static void o(int x) {
		if(x==a[x])r.add(x);
		else {
			b[x]=2;
			l.add(x);
			if(b[a[x]]>1) {
				r.add(a[x]);
				if(l.contains(a[a[x]]))r.add(a[a[x]]);
			}
			else if(b[a[x]]==0)o(a[x]);
			l.remove(l.indexOf(x));
		}
		b[x]=1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		a=new int[n];
		b=new int[n];
		for(;++i<n;a[i]=s.nextInt());
		for(i=0;++i<n;)
			if(b[i]<1)
				o(i);
		System.out.println(r);
		System.out.println(Arrays.toString(b));

	}

}
