package _Algorithm;

import java.util.Scanner;

public class P9711 {
	static long p[];
	static long f3(long n,int d) {
		int f0=0,f1=1,f2=1,r=0,i=2;
		for(;i<=n;i++) {
			f2=(f0+f1)%d;
			if(f2%d==1&&f1%d==0) {
				r=i-1;
				break;
			}
			f0=f1;
			f1=f2;
		}
		if(r>0) {
			int N=(int)n%r;
			f0=0;
			f1=1;
			for(i=2;i<=N;i++) {
				f2=(f0+f1)%d;
				f0=f1;
				f1=f2;
			}
		}
		return f2;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		f3(10000,2000000000);
		for(;i++<n;System.out.println("Case #"+i+": "+p[s.nextInt()]));
	}

}
