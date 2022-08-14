package _Algorithm.DFS;
import java.io.*;
public class P3584_2 {
	static int n,m,K,i,j,a[],h[],R;
	static void o(int x) {
		if(h[x]>0)R=x;
		else {
			h[x]++;
			if(a[x]>0)o(a[x]);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(K=Integer.parseInt(r.readLine());K-->0;) {
			m=n=Integer.parseInt(r.readLine())+1;
			String[]b;
			a=new int[n];
			h=new int[n];
			for(;--n>1;) {
				b=r.readLine().split(" ");
				a[Integer.parseInt(b[1])]=Integer.parseInt(b[0]);
			}
			b=r.readLine().split(" ");
			o(Integer.parseInt(b[0]));
			o(Integer.parseInt(b[1]));
			w.write(R+"\n");
		}
		w.flush();
	}

}
