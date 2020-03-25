package BaekJoon;

import java.util.Scanner;

public class P2798_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],i=0,j,k,r=0,u;
		for(;i<n;a[i++]=s.nextInt());
		outline:for(i=0;i<n-2;i++)
			for(j=i+1;j<n-1;j++)
				for(k=j+1;k<n;k++) {
					u=a[i]+a[j]+a[k];
					if(u<=m)r=r>u?r:u;
					if(r==m)break outline;
				}
		System.out.println(r);
	}

}
