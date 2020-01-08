package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14002_4 {

	static int n,a[],h[],i=0,m,y;
	static StringBuffer[]H;
	static void o(int x,int v,StringBuffer s) {
		h[x]=v;
		s.append(a[x]+" ");
		for(int i=x+1;i<n;i++)
			if(a[i]>a[x]&&h[i]<=v)
				o(i,v+1,new StringBuffer(s.toString()));

	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		h=new int[n];
		H=new StringBuffer[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		//		System.out.println(Arrays.toString(a));

	}

}
