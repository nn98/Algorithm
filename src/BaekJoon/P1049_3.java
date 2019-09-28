package BaekJoon;

import java.util.Scanner;

public class P1049_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b,r=0;
		a=b=9000;
		for(int m=s.nextInt();m>0;m--) {
			int t=s.nextInt();
			a=a<t?a:t;
			t=s.nextInt();
			b=b<t?b:t;
		}
		if(a<b*6) {
			System.out.print(n%6==0?n/6*a:(n/6+1)+a);
			return;
		}
		if(b*6<a) {
			System.out.print(n*b);
			return;
		}
//		r+=a*(n/6)+a<b*(n%6)?a:b*(n%6);
		r+=a*(n/6)+n%6*b;
		System.out.print(r);
	}
}