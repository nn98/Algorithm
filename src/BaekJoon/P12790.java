package BaekJoon;

import java.util.Scanner;

public class P12790 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[4],i,r;
		for(;n-->0;) {
			r=0;
			for(i=0;i<4;a[i++]=s.nextInt());
			for(i=0;i<4;a[i++]+=s.nextInt());
			for(i=0;i++<4;)switch(i) {
			case 1:
				r+=a[0]<1?1:a[0];
				break;
			case 2:
				r+=a[1]<1?1:a[1];
				break;
			case 3:
				r+=2*a[2]<0?0:a[2];
				break;
			case 4:
				r+=a[3];
			}
			System.out.println(r);
		}
	}

}
