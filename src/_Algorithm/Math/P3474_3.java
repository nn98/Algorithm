package _Algorithm.Math;

import java.util.Scanner;

public class P3474_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j,k,a,b;
		long r;
		while(n-->0) {
			i=s.nextInt();
			r=j=0;
			k=1;
			while(j++<i) {
				System.out.println("k= "+k+" j= "+j);
				if(k!=j)
					if(k==5) {
						if(j==2||j==4||j==6||j==8)
							r++;
					}
					else if(j==5)
						if(k==2||k==4||k==6||k==8)
							r++;
				k*=j;
				while(k%10==0)k/=10;
				k%=10;
			}
			System.out.println(r);
		}
	}

}
