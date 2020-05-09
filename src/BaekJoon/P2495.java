package BaekJoon;

import java.util.Scanner;

public class P2495 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=3,r,c,m;
		for(;i-->0;) {
			char[]a=s.next().toCharArray();
			m=r=c=1;
			for(;c++<7;) {
				if(a[c]==a[c-1])r++;
				else r=1;
				m=m>r?m:r;
				System.out.println(r+" "+m);
			}
			System.out.println(m);
		}
	}

}
