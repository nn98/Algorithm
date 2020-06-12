package BaekJoon;

import java.util.*;
public class P1021_5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m],i=0,x=1,j,I,J,k=0,r=0;
		boolean[]b=new boolean[n+1];
		b[0]=true;
		for(;i<m;a[i++]=s.nextInt());
		for(;m>0;) {
			x=x>n?1:x;
			while(b[x]) {
				x++;
				x=x>n?1:x;
			}
			i=j=x;
			I=J=0;
			for(;;i++,j--,I++,J++) {
				i=i>n?0:i;
				j=j<0?n:j;
				while(b[i]) {
					i++;
					i=i>n?0:i;
				}
				while(b[j]) {
					j--;
					j=j<0?n:j;
				}
				if(a[k]==i) {
					r+=I;
					m--;
					b[i]=true;
					x=i+1;
					k++;
					break;
				}
				if(a[k]==j) {
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