package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13023_3 {
	static int n,m,a[][],h[],i,j,c[],f[],E;
	static int o(int x,int d) {
		if(c[x]>0)return 0;
		if(d>4) {
			E=1;
		}
//		System.out.println("from \t"+m+" "+x+" "+d);
		c[x]=1;
//		if(x!=m)
//			if(h[x]>0)
//				return h[x];
		int y=0,z=0,w;
		for(;y<n;y++) {
			if(a[x][y]>0) {
//				if(h[y]>0)w=h[y];
//				if(y<m)w=f[y];
//				else 
					w=o(y,d+1);
				z=z>w?z:w;
			}
		}
//		h[x]=h[x]>z?h[x]:z;
//		h[x]++;
		d=d>z?d:z;
//		System.out.println("\tat: "+x+" re: "+d);
		return d;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		f=new int[n];
		a=new int[n][n];
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[i][j]=a[j][i]=1;
		}
		i=0;
		for(;++m<n;c=new int[n],h=new int[n],f[m]=o(m,1),i=i>f[m]?i:f[m])
			if(i>4)
				break;
//		System.out.println(Arrays.toString(f));
		System.out.println(i>4?1:0);
	}
}