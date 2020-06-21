package _Algorithm.Segment_Tree;

import java.util.Arrays;
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
			while(a[j]>0)j++;
			while(m>0) {
				j++;
				while(a[j]>0)j++;
				m--;
			}
			while(a[j]>0)j++;
			a[j]++;
			r[j]=i;
		}
		
	}

}
