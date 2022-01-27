package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P22352 {
	static int n,m,i,j,k,a[][][];
	static void o(int x) {
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		for(;i<2;i++)
			for(j=0;j<n;j++) {
				t=new StringTokenizer(r.readLine());
				for(k=0;j<n;a[i][j][k++]=Integer.parseInt(t.nextToken()));
			}
		o(0);
	}
}