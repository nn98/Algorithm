package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P1240 {
	static int n,m,i,j,k,p,v[];
	static N[]a;
	static class N{
		List<L>l;
		int i;
		N(int i){
			this.i=i;
		}
		void a(int i,int l) {
			this.l.add(new L(a[i],l));
		}
	}
	static class L{
		N n;
		int l;
		L(N n,int l){
			this.n=n;
			this.l=l;
		}
	}
	static void o(int x,int l) {
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
	}
}