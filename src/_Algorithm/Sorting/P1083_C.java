package _Algorithm.Sorting;

import java.util.Scanner;

public class P1083_C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,m,a[]=new int[50],i=0,j,x,v;
		n=s.nextInt();
		for(;i<n;a[i++]=s.nextInt());
		m=s.nextInt();
		for(i=0;i<n&m>0;i++) {
			x=a[i];
			v=i;
			for(j=i+1;j<n&j<=i+m;j++)
				if(x<a[j]) {
					x=a[j];
					v=j;
				}
			m-=v-i;
			while(v>i) {
				a[v]=a[v-1];
				v--;
			}
			a[i]=x;
		}
		for(i=0;i<n;i++)System.out.print(a[i]+" ");
	}

}
// 뭐가다른거지