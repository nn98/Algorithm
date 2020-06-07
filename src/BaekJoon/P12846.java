package BaekJoon;

import java.util.Scanner;

public class P12846 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,m=1000000,t,r=0;
		for(;++i<=n;t=s.nextInt(),m=m<t?m:t,r=r>m*i?r:m*i);
		System.out.println(r);
	}

}
