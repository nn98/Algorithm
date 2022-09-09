package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P4963 {

	static int n,m,i,j,a[][],h[][],R,c;
	static void o(int x,int y,int z) {
		if(h[x][y]>0|a[x][y]<1)return;
		R+=z;
		h[x][y]++;
		for(int i=x-1;i<x+2;i++)
			for(int j=y-1;j<y+2;j++)
				o(i,j,0);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(;;) {
//			System.out.println(++c);
			StringTokenizer t=new StringTokenizer(r.readLine());
			R=0;
			m=Integer.parseInt(t.nextToken());
			n=Integer.parseInt(t.nextToken());
			if(n==0&&m==0)break;
			a=new int[n+2][m+2];
			h=new int[n+2][m+2];
			for(i=0;++i<=n;) {
				t=new StringTokenizer(r.readLine());
				for(j=0;++j<=m;) {
					a[i][j]=Integer.parseInt(t.nextToken());
				}
			}
//			for(int[]b:a)System.out.println(Arrays.toString(b));
			for(i=0;++i<=n;)
				for(j=0;++j<=m;o(i,j,1));
//			System.out.println();
//			for(int[]b:h)System.out.println(Arrays.toString(b));
//			System.out.println("\n"+R);
			w.write(R+"\n");
		}
		w.flush();
	}
}
