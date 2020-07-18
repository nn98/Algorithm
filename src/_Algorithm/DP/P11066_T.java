package _Algorithm.DP;

import java.io.*;
import java.util.*;

public class P11066_T {

	static int u[],h[][],f[],n,m,i,j,k;
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static int o(int s,int e) {
//		System.out.println(s+" "+e);
//		return u[e]-s==0?0:u[s-1];
		if(s==0)return u[e];
		else return u[e]-u[s-1];
	}
	static int p()throws Exception{
//		내가봐도 양심없다
		u[0]=f[0];
		for(i=0;++i<m;u[i]=u[i-1]+f[i]);
		for(i=0;i<m-1;h[i][i+1]=f[i]+f[i+++1]);
		w.write(Arrays.toString(f)+"\t입력 배열\n");
		w.write(Arrays.toString(u)+"\t합 배열\n");
		w.newLine();
		for(int[]a:h)w.write(Arrays.toString(a)+"\n");
		w.write("DP i행 i+1열에 입력 배열 i + i+1\n");
		w.newLine();
		w.flush();
		for(i=1;++i<m;)
			for(j=0;i+j<m;j++)
				for(k=j;k<i+j;k++) {
					if(h[j][i+j]==0)h[j][i+j]=h[j][k]+h[k+1][i+j]+o(j,i+j);
					else h[j][i+j]=Math.min(h[j][i+j],h[j][k]+h[k+1][i+j]+o(j,i+j));
					for(int[]a:h)w.write(Arrays.toString(a)+"\n");
					w.newLine();
					w.flush();
				}
//		뭐 이따구로 괴랄해
		return h[0][m-1];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		while(n-->0) {
			m=Integer.parseInt(r.readLine());
			f=new int[m];
			u=new int[m];
			h=new int[m][m];
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(i=0;i<m;f[i++]=Integer.parseInt(t.nextToken()));
			w.write(p()+"\n");
		}
		w.flush();
	}
}