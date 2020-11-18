package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.*;
public class P10999{
	static int n,m,l,h,i,x,y;
	static long a[];
	static void u() {
		System.out.println(Arrays.toString(a));
		for(;i>1;i/=2,a[i]=a[i*2]+a[i*2+1]);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		for(l=2;l<n;l*=2);
		a=new long[l*2];
		while(i<n)a[l+i++]=Integer.parseInt(r.readLine());
		System.out.println(Arrays.toString(a));
		for(h=0;h<n;i=l+h,u(),h++);
		System.out.println(Arrays.toString(a));
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			switch(t.nextToken()) {
			case "1":
				x=Integer.parseInt(t.nextToken());
				y=Integer.parseInt(t.nextToken());
				
				break;
			case "2":
				x=Integer.parseInt(t.nextToken());
				y=Integer.parseInt(t.nextToken());
				
				break;
			}
		}
	}
}