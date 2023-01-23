package BaekJoon.DFS;
// �����ϰ� Ǫ�� ���ɷȳ�
import java.io.*;
import java.util.*;
public class P2617 {
	static int n,m,i,j,k=-1,a[][],v[];
	static void h(int x) {
		k++;
		v[x]++;
		for(int i=0;++i<n;)
			if(a[x][i]>0)
				if(v[i]<1)h(i);
	}
	static void l(int x) {
		k++;
		v[x]++;
		for(int i=0;++i<n;)
			if(a[x][i]<0)
				if(v[i]<1)l(i);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[j][i]=1;
			a[i][j]=-1;
		}
		m=0;
//		for(int[]b:a)System.out.println(Arrays.toString(b));
		for(j=0;++j<n;k=-1) {
			v=new int[n];
//			System.out.print("h "+j);
			h(j);
//			System.out.println("\t"+k);
			if(k>=n/2) {
				m++;
				continue;
			}
			k=-1;
			v=new int[n];
//			System.out.print("l "+j);
			l(j);
//			System.out.println("\t"+k);
			if(k>=n/2)m++;
		}
		System.out.println(m);
	}

}
