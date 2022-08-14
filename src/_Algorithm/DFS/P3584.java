package _Algorithm.DFS;
import java.io.*;
public class P3584 {
	static int n,m,K,i,j,a[][],h[],R;
	static void o(int x) {
		if(h[x]>0)R=x;
		else {
			h[x]++;
			for(int y=0;++y<n;)if(a[x][y]>0)o(y);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(K=Integer.parseInt(r.readLine());K-->0;) {
			n=Integer.parseInt(r.readLine())+1;
			String[]b;
			a=new int[n][n];
			for(;--n>0;) {
				b=r.readLine().split(" ");
				a[Integer.parseInt(b[1])][Integer.parseInt(b[0])]++;
			}
			b=r.readLine().split(" ");
			o(Integer.parseInt(b[0]));
			o(Integer.parseInt(b[1]));
			System.out.println(R);
		}
	}

}
