package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P9094 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double n=s.nextInt(),i,a,b,j,r;
		for(;n-->0;) {
			r=0;
			a=s.nextInt();
			b=s.nextInt();
			for(i=0;++i<a-1;)for(j=i;++j<n;) {
				System.out.println(i+" "+j+" "+i*i+j*j+b+" "+a*b);
				if(((i*i+j*j+b)/(a*b))%1==0)r++;
			}
			System.out.println(r);
		}
	}

}
