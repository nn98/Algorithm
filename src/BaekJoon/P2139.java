package BaekJoon;

import java.util.Scanner;

public class P2139 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,d[]=new int[13],r,i;
		d[2]=-3;
		d[4]=d[6]=d[9]=d[11]=-1;
		do {
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			if(c%4==0) {
				if(c%100==0)d[2]-=1;
				if(c%400==0)d[2]+=1;
				d[2]+=1;
			}
			r=0;
			for(i=1;i<b;r+=31+d[i++]);
			r+=a;
			System.out.println(r);
		}while(a!=0);
	}

}
