package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P3653 {

	static int a[],t[],n,i,m,j,d;
	static int o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(n=s.nextInt();n-->0;) {
			i=s.nextInt();
			j=s.nextInt();
			for(m=1;m<i;m*=2);
			m*=2;
			a=new int[i];
			t=new int[m];
			for(m=0;++m<i;a[m]=m);
			System.out.println(Arrays.toString(t));
			o(1,0,i-1);
			System.out.println(Arrays.toString(t));
		}
	}

}
