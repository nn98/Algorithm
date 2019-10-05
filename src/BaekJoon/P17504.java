package BaekJoon;

import java.util.Scanner;

public class P17504 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n];
		long p=1,q;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		q=a[n-1];
		for(int i=n-2;i>=0;i--) {
//			System.out.println(p+" "+q);
			p+=a[i]*q;
			long t=p;
			p=q;
			q=t;
		}
		System.out.println(q-p+" "+q);
	}
}