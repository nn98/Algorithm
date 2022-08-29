package _Algorithm.BFS;
import java.io.*;
import java.util.*;
public class P21738 {
	static int n,m,i,j,p,a[][],b[],x,y,d[];
	static void o(int x) {
		System.out.println(x);
		j++;
		b[x]++;
		for(int i=0;i<n;i++)if(b[i]<1)o(i);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		d=new int[m+1];
		p=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		b=new int[n--];
		for(;++i<n;) {
			t=new StringTokenizer(r.readLine());
			x=Integer.parseInt(t.nextToken());
			y=Integer.parseInt(t.nextToken());
			a[x][y]=a[y][x]=1;
		}
		b[p]++;
		for(;m>0;j=0,o(m),d[m]=j,m--);
		System.out.println(Arrays.toString(d));
	}

}
