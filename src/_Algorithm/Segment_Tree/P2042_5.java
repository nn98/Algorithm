package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class P2042_5 {

	static int n,m,i,j,l;
	static long a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		for(l=1;l<n;l*=2);
		a=new long[l*2];
		for(;i<n;) {
			j=l+i++;
			a[j]=Integer.parseInt(r.readLine());
			if(i%2==0|i==n)o();
		}
		System.out.println(Arrays.toString(a));
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			switch(n) {
			case 1:
				n=j;
				j=i+l-1;
				a[j]=n;
				o();
				System.out.println(Arrays.toString(a));
				break;
			case 2:
				w.write(p(1,1,l));
			}
		}
	}

}
