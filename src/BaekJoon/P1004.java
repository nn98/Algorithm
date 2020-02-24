package BaekJoon;

import java.util.Scanner;

public class P1004 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,a[]=new int[4],i,j,b[]=new int[3];
		for(;n-->0;) {
			for(i=0;i<4;a[i++]=s.nextInt());
			i=s.nextInt();
			for(;i-->0;) {
				for(j=0;j<3;b[j]=s.nextInt());
			}
		}
	}

}
