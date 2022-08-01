package _Algorithm.DFS;
import java.util.*;
import java.io.*;
public class P13265_2{
	static int u,n,m,a[][],v[],i,j,R;
	static void o(int x) {
		v[x]++;
		for(int i=0;++i<n&R<1;) {
			if(i==x)continue;
			if(a[x][i]>0) {
				R=a[x][0]!=a[i][0]?0:1;
				if(v[i]<1&R<1)o(i);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		u=Integer.parseInt(r.readLine());
		StringTokenizer t;
		for(;u-->0;) {
			t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken())+1;
			m=Integer.parseInt(t.nextToken());
			a=new int[n][n];
			v=new int[n];
			for(;m-->0;) {
				t=new StringTokenizer(r.readLine());
				i=Integer.parseInt(t.nextToken());
				j=Integer.parseInt(t.nextToken());
				a[i][j]=a[j][i]=1;
//				a[j][0]=a[i][0]<1?1:0;
				switch(a[i][0]) {
				case 0:
					switch(a[j][0]) {
					case 0:
						a[i][0]=1;
						a[j][0]=2;
						break;
					case 1:
						a[i][0]=2;
						break;
					case 2:
						a[i][0]=1;
					}
					break;
				case 1:
					switch(a[j][0]) {
					case 0:
						a[j][0]=2;
						break;
					case 1:
						R=1;
						break;
					case 2:
					}
					break;
				case 2:
					switch(a[j][0]) {
					case 0:
						a[j][0]=1;
						break;
					case 1:
						break;
					case 2:
						R=1;
					}
				}
			}
			for(i=0;++i<n&R<1;o(i));
			System.out.println(R<1?"possible":"impossible");
			R=0;
		}
	}

}
