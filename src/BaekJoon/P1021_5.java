package BaekJoon;

import java.util.Scanner;

public class P1021_5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m],i=0,x=1,j,I,J,k=0,r=0;
		boolean[]b=new boolean[n+1];
		b[0]=true;
		for(;i<m;a[i++]=s.nextInt());
		for(;m>0;) {
			x=x>n?1:x;
			i=j=x;
			I=J=0;
			for(;;i++,j--,I++,J++) {
				i=i>n?0:i;
				j=j<0?n:j;
				while(b[i]) {
//					I--;
					i++;
					i=i>n?0:i;
				}
				while(b[j]) {
//					J--;
					j--;
					j=j<0?n:j;
				}
				System.out.printf("base:%d forw:%d(+%d) back:%d(-%d)\n",x,i,I,j,J);
				if(a[k]==i) {
					System.out.println("i(forw): "+a[k]+" "+i+" "+I);
					r+=I;
					m--;
					b[i]=true;
					x=i+1;
					k++;
					break;
				}
				if(a[k]==j) {
					System.out.println("j(back): "+a[k]+" "+j+" "+J);
					r+=J;
					m--;
					b[j]=true;
					x=j+1;
					k++;
					break;
				}
			}
		}
		System.out.print(r);
	}
}