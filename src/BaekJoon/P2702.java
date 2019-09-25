package BaekJoon;

import java.util.Scanner;

public class P2702 {

	static int sol1(int a,int b) {
		if(b>a) {
			int t=a;
			a=b;
			b=t;
		}
		int t=b%a;
		while(t!=0) {
			b=a;
			a=t;
			t=b%a;
		}
		return a;
	}

	static int sol2(int a,int b) {
		int s=sol1(a,b);
		return (a/s)*(b/s)*s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int a=s.nextInt(),b=s.nextInt();
			System.out.println(sol2(a,b)+" "+sol1(a,b));
		}
	}

}
