package _Algorithm.DFS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;
public class P15971_3 {
	static int n,x,y,i,j,k,p,v[];
	static List<N>[]l;
	static class N{
		int n,m;
		N(int a,int b){
			n=a;
			m=b;
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		x=Integer.parseInt(t.nextToken());
		y=Integer.parseInt(t.nextToken());
		v=new int[n];
		for(;++k<n-1;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			p=Integer.parseInt(t.nextToken());
			b[i][j]=b[j][i]=p;
		}
		o(x,0,0);
		System.out.print(d[y]-q[y]);
	}
}