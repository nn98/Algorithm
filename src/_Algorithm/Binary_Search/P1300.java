package _Algorithm.Binary_Search;
//http://wookje.dance/2017/02/20/boj-1300-K%EB%B2%88%EC%A7%B8-%EC%88%98/

import java.util.Scanner;

public class P1300 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),m,f=1,t=k,i,u,r=0;
		while(f<=t) {
			m=(f+t)/2;
			u=0;
			for(i=0;++i<=n;u+=m/i<n?m/i:n);
			if(u<k)f=m+1;
			else {
				r=m;
				t=m-1;
			}
		}
		System.out.print(r);
	}

}
