package BaekJoon;

import java.util.Scanner;

public class P1057 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=s.nextInt(),b=s.nextInt(),r=1;
		if(a>b) {
			int t=a;
			a=b;
			b=t;
		}
		while(!(b-a==1&&a%2==1)) {
			a=a%2==0?a/2:a/2+1;
			b=b%2==0?b/2:b/2+1;
			n/=2;
			if(n==0) {
				r=-1;
				break;
			}
			r++;
		}
		System.out.println(r);
	}

}
