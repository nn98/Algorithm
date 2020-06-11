package _Algorithm.Sweeping;

import java.util.Arrays;
import java.util.Scanner;

public class P2104_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,a[],b[],m,i=0,j=0;
		long u[],v,w=0;
		a=new int[n+1];
		b=new int[n];
		u=new long[n];
		for(;++i<n;u[i]=u[i-1]+(a[i]=s.nextInt()));
		a[n]=0;
		for(i=0;++i<=n;) {
			while(a[b[j]]>=a[i]) {
				m=a[b[j--]];
				if(j<0)break;
				v=m*(u[i-1]-u[b[j]]);
				w=w>v?w:v;
			}
			b[++j]=i;
		}
		System.out.print(w);
	}

}
