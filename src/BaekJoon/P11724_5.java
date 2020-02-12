package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11724_5 {
	static int n,m,R=0,x=0,y,p,q;
	static boolean h[],a[][];
	static void o(int i,StringBuffer f) {
		System.out.println(i+" / "+f);
		String[]b=f.toString().split(" ");
		if(!b[0].equals(""))
			if(b[0].equals(""+i)) {
				boolean c=false;
				for(String s:b) {
					int j=Integer.parseInt(s);
					c=h[j];
					h[j]=true;
				}
				if(!c)System.out.println(f+"++");
				R+=c?0:1;
				return;
			}
		f.append(i+" ");
		for(int j=1;j<n;j++)
			if(a[i][j])
				o(j,f);
		System.out.println(Arrays.toString(b)+" "+b.length);
		if(!b[0].equals("")) {
			boolean c=false;
			for(String s:b) {
				int j=Integer.parseInt(s);
				c=h[j];
				h[j]=true;
			}
			if(!c)System.out.println(f+"++");
			R+=c?0:1;
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new boolean[n][n];
		h=new boolean[n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			p=Integer.parseInt(t.nextToken());
			q=Integer.parseInt(t.nextToken());
			//			a[p][q]=a[q][p]=true;
			a[p][q]=true;
		}
		for(boolean[]b:a)System.out.println(Arrays.toString(b));
		for(m=1;m<n;m++)if(!h[m])o(m,new StringBuffer());
		System.out.println(Arrays.toString(h));
		System.out.println(R);
	}
}
