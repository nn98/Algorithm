package _Algorithm.Sorting;

import java.util.Scanner;

public class P1083_4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,r=-1,t,m,u,T;
		for(;i<n;a[i++]=s.nextInt());
		i=s.nextInt();
		while(i>0) {
			r++;
			t=r;
			for(j=t+1;j<n;j++)
				if(a[j]>a[t])
					if(j-r<=i)
						t=j;
			if(t==r) {
				if(r==n)break;
				continue;
			}
			m=a[T=t];
			u=a[r];
//			for(j=0;j<=t;a[j+1]=a[j++]);
			for(;t>=r;a[t]=a[t--+1]);
			a[r]=m;
			a[T]=u;
			i-=T;
		}
		for(int b:a)System.out.print(b+" ");
	}
}