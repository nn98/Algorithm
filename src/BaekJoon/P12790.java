package BaekJoon;

import java.util.Scanner;

public class P12790 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[4],i,r;
		for(;n-->0;) {
			for(i=0;i<4;a[i++]=s.nextInt());
			for(i=0;i<4;a[i++]+=s.nextInt());
			if(a[0]<1)a[0]=1;
			if(a[1]<1)a[1]=1;
			if(a[2]<0)a[2]=0;
			System.out.println(a[0]+a[1]*5+2*a[2]+2*a[3]);
		}
	}
}