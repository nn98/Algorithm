package BaekJoon;

import java.util.*;
public class P9084_3{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,p,i,j,a[],d[];
		for(;n-->0;) {
			m=s.nextInt();
			a=new int[m+1];
			for(i=0;i++<m;a[i]=s.nextInt());
			p=s.nextInt();
			d=new int[p+1];
			d[0]=1;
			for(i=0;i++<m;)
				for(j=a[i];j<=p;j++)
					d[j]+=d[j-a[i]];
			System.out.println(d[p]);
		}
	}
}