package BaekJoon;

import java.util.Scanner;

public class P1004 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,x,a[]=new int[4],i,j,b[]=new int[3],c,d,e,f,r;
		for(;n-->0;) {
			r=0;
			for(i=0;i<4;a[i++]=s.nextInt());
			i=s.nextInt();
			for(;i-->0;) {
				for(j=0;j<3;b[j++]=s.nextInt());
				b[2]*=b[2];
				c=b[0]-a[0];
				d=b[1]-a[1];
				m=c*c+d*d;
				e=b[0]-a[2];
				f=b[1]-a[3];
				x=e*e+f*f;
				r+=m>b[2]&&x>b[2]?0:1;
			}
			System.out.println(r);
		}
	}
}