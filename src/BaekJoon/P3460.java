package BaekJoon;

import java.util.Scanner;

public class P3460 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,j;
		for(;n-->0;) {
			m=s.nextInt();
			StringBuffer b=new StringBuffer();
			for(j=1,i=0;j<m;j*=2,i++);
			j/=2;
			for(;--i>=0;j/=2) {
				b.append(" "+(m/j==1?i:""));
				m%=j;
			}
			System.out.println(b);
		}
	}
}