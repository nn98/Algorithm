package _Algorithm.BackTracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15654 {

	static int n,m;
	static int[]a;
	static char[]f;
	static boolean[]c;
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static void o(int x)throws Exception{
		if(x==m) {
			for(char a:f)
				w.write(a+" ");
			w.newLine();
		}else
			for(int i=0;i++<n;)
				if(c[i])continue;
				else {
					f[x]=(char)(a[i]+'0');
					c[i]=true;
					o(x+1);
					c[i]=false;
				}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		Arrays.sort(a);
		a=new int[n];
		f=new char[m];
		c=new boolean[n+1];
		t=new StringTokenizer(r.readLine());
		for(int i=0;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		o(0);
		w.flush();
	}

}