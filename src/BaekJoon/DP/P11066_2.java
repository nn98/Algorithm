package BaekJoon.DP;

import java.io.*;
import java.util.*;

public class P11066_2 {

	static int u[],h[][],f[],n,m,i,j,k;
	static int o(int s,int e) {
//		System.out.println(s+" "+e);
//		return u[e]-s==0?0:u[s-1];
		if(s==0)return u[e];
		else return u[e]-u[s-1];
	}
	static int p() {
//		�������� ��ɾ���
		u[0]=f[0];
		for(i=0;++i<m;u[i]=u[i-1]+f[i]);
		for(i=0;i<m-1;h[i][i+1]=f[i]+f[i+++1]);
		for(i=1;++i<m;)
			for(j=0;i+j<m;j++)
				for(k=j;k<i+j;k++)
					if(h[j][i+j]==0)h[j][i+j]=h[j][k]+h[k+1][i+j]+o(j,i+j);
					else h[j][i+j]=Math.min(h[j][i+j],h[j][k]+h[k+1][i+j]+o(j,i+j));
//		�� �̵����� ������
		return h[0][m-1];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
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