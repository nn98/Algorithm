package BaekJoon;

import java.util.Scanner;
public class P9610 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b,r[]=new int[6];
		for(;n-->0;) {
			a=s.nextInt();
			b=s.nextInt();
			if(a==0||b==0)r[5]++;
			else {
				if(a>0)
					if(b>0)r[1]++;
					else r[4]++;
				else
					if(b>0)r[2]++;
					else r[3]++;
			}
		}
		for(n=1;n<6;n++)System.out.println((n==5?"AXIS":("Q"+n))+": "+r[n]);
	}
}