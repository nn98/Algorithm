package _Algorithm.Math;

import java.util.Scanner;

public class P14623 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next(),m=s.next();
		int p=n.length(),q=m.length(),i=p;
		long r,N=0,M=0;
		for(;i-->0;N+=n.charAt(i)>48?Math.pow(2,p-i-1):0);
		for(i=q;i-->0;M+=m.charAt(i)>48?Math.pow(2,q-i-1):0);
		r=N*M;
		for(i=1;i<r;i*=2);
		for(;i>0;System.out.print(r/i),r%=i,i/=2);
	}

}
