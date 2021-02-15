package _Algorithm.Segment_Tree;

import java.util.Scanner;
public class P15560_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),u=s.nextInt(),v=s.nextInt(),i=0,a[]=new int[1001],j,k,r;
		for(;i++<n;a[i]=u*s.nextByte()+v);
		while(m-->0) {
			n=s.nextInt();
			i=s.nextInt();
			j=s.nextInt();
			if(n>0)a[i]=u*j+v;
			else {
				r=n=Integer.MIN_VALUE;
				for(k=i;k<=j;n=Math.max(n,r=Math.max(r,0)+a[k]),k++);
				System.out.println(n-v);
			}
		}
	}
}