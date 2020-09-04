package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13023_2 {
	static int n,m,a[][],h[],i,j,c[];
	static int o(int x,int d) {
		if(c[x]>0)return 0;
		System.out.println(x+" "+d);
		c[x]=1;
		if(h[x]>0)return h[x];
		h[x]=d;
		int y=0,z=0,w;
		for(;y<n;y++) {
			if(a[x][y]>0) {
				w=o(y,d+1);
				z=z>w?z:w;
			}
		}
		h[x]=h[x]>z?h[x]:z;
		System.out.println("\tat: "+x+" re: "+h[x]);
		return h[x];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		h=new int[n];
		c=new int[n];
		a=new int[n][n];
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[i][j]=a[j][i]=1;
		}
		i=0;
		for(;++m<n;c=new int[n],System.out.println("go at:"+m),o(m,1),i=i>h[m]?i:h[m])
			if(i>4)
				break;
		System.out.println(Arrays.toString(h));
		System.out.println(i>4?1:0);
	}
}
