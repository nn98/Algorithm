package _Algorithm.Sorting;

import java.util.Scanner;

public class P1083_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,r=0,t,m;
		for(;i<n;a[i++]=s.nextInt());
		i=s.nextInt();
		while(i>0) {
			t=r;
			for(j=t+1;j<n;j++)
				if(a[j]>a[t])
					if(j<=i)
						t=j;
			if(t==r) {
				r++;
				if(r==n)break;
				continue;
			}
			m=a[t];
//			for(j=0;j<=t;a[j+1]=a[j++]);
			for(;t>=r;a[t]=a[t--+1]);
			a[r]=m;
			i-=t;
		}
		for(int b:a)System.out.print(b+" ");
	}
}