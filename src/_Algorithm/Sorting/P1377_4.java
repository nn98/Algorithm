package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1377_4 {
	static int n,i,j,b[][],c[][],t[],m,v;
	static void w(int i,int j) {
		t=b[i];
		b[i]=b[j];
		b[j]=t;
	}
	static void o(int s,int e) {
		if(s<e) {
			p(s,e);
			o(s,j);
			o(j+2,e);
		}
	}
	static void p(int s,int e) {
		m=(s+e)/2;
		w(m,e);
		v=b[e][0];
		j=s-1;
		for(;s<e;s++)if(b[s][0]<v)w(++j,s);
		w(j+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		b=new int[n][2];
		c=new int[n][2];
		for(;i<n;c[i][0]=b[i][0]=s.nextInt(),c[i][1]=b[i][1]=i++);
		//		for(int[]a:b)System.out.println(Arrays.toString(a));
		o(0,n-1);
		for(int[]a:b)System.out.println(Arrays.toString(a));
		for(int[]a:c)System.out.println(Arrays.toString(a));
		m=0;
		for(i=n;i-->0;)
			for(j=i;j-->0;)
				if(c[i][0]==b[j][0]&c[i][1]==b[j][1]) {
					System.out.println("c "+i+" / b "+j);
					m=m>i-j?m:i-j;
				}

					System.out.println(m);
	}

}