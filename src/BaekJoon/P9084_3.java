package BaekJoon;

import java.util.Scanner;

public class P9084_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,p,i,j,a[],d[];
		for(;n-->0;) {
			m=s.nextInt();
			a=new int[m+1];
			for(i=0;i++<m;a[i]=s.nextInt());
			p=s.nextInt();
			d=new int[p+1];
			for(i=0;i++<m;)
				for(j=0;j++<p;)
					d[j]+=d[j-a[i]];
			System.out.println(d[p]);
		}
	}

}
