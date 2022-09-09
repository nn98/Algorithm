package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P14615_2 {
	static int n,m,i,j,h[];
	static Set<Integer>l[],z,L[];
	static void o(int x) {
//		System.out.println(x+" "+z+" "+(l[x]!=null));
		h[x]++;
		for(int p:z) {
//			System.out.println(x+" "+p+" "+l[p]);
			L[p].add(x);
		}
		z.add(x);
		if(l[x]!=null)for(int p:l[x])if(h[p]<1)o(p);
//		for(int p:z) {
//			if(p!=x)l[p].add(x);
////			System.out.println(x+" "+p+" "+l[p]);
//			
//		}
		z.remove(x);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String[]a=r.readLine().split(" ");
		n=Integer.parseInt(a[0]);
		m=Integer.parseInt(a[1]);
		l=new Set[n+1];
		L=new Set[n+1];
		for(;m-->0;) {
			a=r.readLine().split(" ");
			i=Integer.parseInt(a[0]);
			if(l[i]==null) {
				l[i]=new HashSet();
				L[i]=new HashSet();
			}
			l[i].add(Integer.parseInt(a[1]));
//			if(l[j]!=null)for(int c:l[j])l[i].add(c);
		}
//		for(i=0;i++<n;System.out.println(l[i]));
//		System.out.println();
		for(i=0;i++<n;h=new int[n+1],z=new HashSet(),o(i));
		for(i=0;i++<n;) {
			if(l[i]!=null) {
				l[i].addAll(L[i]);
			}
//			System.out.println(i+": "+l[i]);
		}
		for(i=Integer.parseInt(r.readLine());i-->0;) {
			j=Integer.parseInt(r.readLine());
//			if(l[1]==null)w.write("Destroyed the CTP\n");
			try{
				w.write(l[1].contains(j)&l[j].contains(n)?"Defend the CTP\n":"Destroyed the CTP\n");
			}catch(Exception e) {
				w.write("Destroyed the CTP\n");
			}
		}
		w.flush();
		
	}

}
