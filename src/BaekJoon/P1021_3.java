package BaekJoon;

import java.util.Scanner;

public class P1021_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m],i=0,x=0,j,I,J,k=0,r=0;
		boolean[]b=new boolean[n+1];
		b[0]=true;
		for(;i<m;a[i++]=s.nextInt());
		for(;m>0;) {
			i=j=x;
			I=J=0;
			for(;;i++,j--,I++,J++) {
				if(i>n)i=0;
				if(j<0)j=n;
				if(a[k]==i) {
					r+=I;
					m--;
					b[i]=true;
					x=i;
					k++;
					break;
				}
				if(a[k]==j) {
					r+=J;
					m--;
					b[j]=true;
					x=j;
					k++;
					break;
				}
				if(b[i])I--;
				if(b[j])J--;
			}
		}
		System.out.print(r);
	}

}
