package BaekJoon.DFS;
//BFS
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class P17073 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n,i=0,a[];
		double m,R=0;
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n+1];
		for(;++i<n;t=new StringTokenizer(r.readLine()),
				a[Integer.parseInt(t.nextToken())]++,a[Integer.parseInt(t.nextToken())]++);
		for(i=1;i<n;)if(a[++i]==1)R++;
		System.out.println(String.format("%.10f",m/R));
	}
}