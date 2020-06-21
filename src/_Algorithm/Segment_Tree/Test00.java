package _Algorithm.Segment_Tree;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i=0,j,a[],r[];
		a=new int[n];
		r=new int[n];
		for(;i++<n;) {
			j=0;
			m=s.nextInt();
			while(m-->0)while(a[++j]>0);
			System.out.println(j);
			a[j]++;
			r[j]=i;
		}
	}

}
