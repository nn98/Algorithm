package _Algorithm.DFS;
//BFS
import java.util.*;

public class P2668 {

	static int n,a[],i,j,b[];
	static  List<Integer>l=new ArrayList(),r=new ArrayList();
	static void o(int x) {
		b[x]=2;
		l.add(x);
		if(b[a[x]]>1)r.add(a[x]);
		else if(b[a[x]]==0)o(a[x]);
		l.remove(x);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		a=new int[n];
		b=new int[n];
		for(;++i<n;a[i]=s.nextInt());
		o(1);
		System.out.println(l);
		System.out.println(r);
		
	}

}
