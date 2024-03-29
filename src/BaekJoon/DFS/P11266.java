package BaekJoon.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class P11266 {

	static int n,m,r,c[],i,j;
	static boolean[]a,b[];
	
	static int o(int x,boolean y) {
//		System.out.println(x);
		c[x]=++r;
		int ret=c[x],child=0,k=0;
		for(;++k<n;) {
			if(b[x][k]) {
				if(c[k]>0) {
					ret=Math.min(ret,k);
					continue;
				}
				child++;
				int p=o(k,false);
				if(!y&&p>=c[x])a[x]=true;
				ret=Math.min(ret, p);
			}
		}
		if(y)a[x]=child>=2;
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		a=new boolean[n];
		b=new boolean[n][n];
		c=new int[n];
		for(;m-->0;i=s.nextInt(),j=s.nextInt(),b[i][j]=b[j][i]=true);
		for(m=0;++m<n;)if(c[m]==0)o(m,true);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a));
		m=0;
		for(i=0;++i<n;m+=a[i]?1:0);
		System.out.println(m);
		for(i=0;++i<n;System.out.print(a[i]?i+" ":""));
	}

}