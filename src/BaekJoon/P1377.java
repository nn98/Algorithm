package BaekJoon;

import java.util.Scanner;

public class P1377 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n+1],i=1,j,t;
		for(;i<=n;a[i++]=s.nextInt());
		for(i=1;i<=n+1;i++) {
			boolean c=false;
			for(j=1;j<=n-i;j++) {
				if(a[j]>a[j+1]) {
					c=true;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			if(!c) {
				System.out.print(i);
				break;
			}
		}
	}

}
