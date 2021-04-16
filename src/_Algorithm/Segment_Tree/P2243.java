package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.StringTokenizer;
public class P2243 {
	static int n,m,i,j,p,a[];
	static void o() {
		for(;i>1;i/=2,a[i]=a[i*2]+a[i*2+1]);
	}
	static int p(int n,int s,int e) {
		return 0;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		while(n-->0) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			switch(t.nextToken()) {
			case "1":
				break;
			case "2":
				
			}
		}
	}
}