package _Algorithm.BackTracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15664 {

	static int n,m,L=10001;
	static int[]f,c=new int[L];
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static void o(int x)throws Exception{
		if(x==m) {
			for(int a:f)
				w.write(a+" ");
			w.newLine();
		}else {
			int i=f[x==0?x:x-1],j=m;
			for(;i<L&&j>0;i++) {
				//				if(x>0)
				//					if(f[x-1]>a[i-1])continue;
				if(c[i]==0)continue;
				else {
					f[x]=i;
					c[i]--;
					o(x+1);
					c[i]++;
				}
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
//		a=new int[n];
		f=new int[m];
		t=new StringTokenizer(r.readLine());
//		for(int i=0;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(int i=0;i++<n;c[Integer.parseInt(t.nextToken())]++);
		o(0);
		w.flush();
	}

}