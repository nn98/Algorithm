package BaekJoon;

import java.util.Scanner;

public class P1049_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b,r=0;
		a=b=Integer.MAX_VALUE;
		for(int m=s.nextInt();m>0;m--) {
			int t=s.nextInt();
			a=a<t?a:t;
			t=s.nextInt();
			b=b<t?b:t;
		}
		if(a==0||b==0) {
			System.out.print(0);
			return;
		}
		if(a<b*6) {
			r+=n/a;
			r+=a<n%6*b?a:n%6*b;
		} else {
			r+=b*n;
		}
		System.out.print(r);
	}
}
