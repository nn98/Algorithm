package _Algorithm.DP;

import java.io.*;
import java.util.*;

public class P11066_2 {

	static int u[],h[][],f[],n,m,i,a;
	static int o(int s,int e) {
		return s==0?u[e]:u[e]-u[s-1]; 
	}
	static int p() {
//		내가봐도 양심없다
		h=new int[m][m];
		return 0;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		while(n-->0) {
			m=Integer.parseInt(r.readLine());
			f=new int[m];
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(i=0;i<m;f[i++]=Integer.parseInt(t.nextToken()));
			w.write(p()+"\n");
		}
		w.flush();
	}
}