package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1377_4 {
	static int n,i,j,b[][],t[],m;
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
		n=b[e][0];
		j=s-1;
		for(;s<e;s++)if(b[s][0]<n)w(++j,s);
		w(j+1,e);
		System.out.println("re :"+j);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		b=new int[n][2];
		for(;i<n;b[i][0]=s.nextInt(),b[i][1]=i++);
		for(int[]a:b)System.out.println(Arrays.toString(a));
		o(0,n-1);
		for(int[]a:b)System.out.println(Arrays.toString(a));
	}

}