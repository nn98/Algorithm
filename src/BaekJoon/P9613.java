package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9613 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m,v[],i,j,M,R;
		boolean[][]a;
		for(;n-->0;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			M=m=Integer.parseInt(t.nextToken());
			a=new boolean[m][];
			v=new int[m];
			R=0;
			for(;m-->0;) {
				v[m]=Integer.parseInt(t.nextToken());
				a[m]=new boolean[v[m]+1];
				for(j=1;j<=v[m]/2;j++)if(v[m]%j==0)a[m][j]=a[m][v[m]/j]=true;
			}
			for(i=0;i<M;i++) {
				for(j=i;++j<M;) {
					for(m=Math.min(v[i],v[j]);m>0&&!(a[i][m]&&a[j][m]);m--);
					System.out.println(m);
					R+=m;
				}
			}
			System.out.println(" "+R);
//			for(boolean[]X:a)System.out.println(Arrays.toString(X));
			
		}
	}
}
//m=Math.min(v[i],v[j])
//m=v[i]<v[j]?v[i]:v[j]