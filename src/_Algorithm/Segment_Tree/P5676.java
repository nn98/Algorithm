package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P5676 {

	static int n,m,a[],l,i,j,x,y,F;
	static void o() {
//		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
		for(;j>1&F>0;) {
			j/=2;
			x=a[j*2]==0?0:(a[j*2]>0?1:-1);
			if(j*2+1<l)
				y=a[j*2+1]==0?0:(a[j*2+1]>0?1:-1);
			a[j]=x*y;
			if(a[j]==0)F=0;
		}
		for(;j>1&F==0;j/=2,a[j]=0);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken());
			m=Integer.parseInt(t.nextToken());
			for(l=1;l<n;l*=2);
			a=new int[l*2];
			t=new StringTokenizer(r.readLine());
			for(i=0;i<n;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),F=1,o());
			System.out.println(Arrays.toString(a));
		}
		
	}

}