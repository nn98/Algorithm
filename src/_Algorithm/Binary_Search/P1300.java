package _Algorithm.Binary_Search;

import java.util.Scanner;

public class P1300 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),m,f=1,t=k,i,u,r=0;
		while(f<=t) {
			m=(f+t)/2;
			u=0;
			for(i=0;++i<=n;u+=m/i<n?m/i:n);
			System.out.println(f+" "+t+" "+m+" "+u);
			if(u<k)f=m+1;
			else {
				r=m;
				t=m-1;
			}
		}
		System.out.print(r);
	}

}
