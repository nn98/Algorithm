package BaekJoon;
//https://m.blog.naver.com/PostView.nhn?blogId=coke_mania&logNo=221551776740&proxyReferer=https%3A%2F%2Fwww.google.com%2F

import java.util.Scanner;

public class P17212_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[100001],i=8,r;
		if(n%7==0)r=n/7;
		else {
			a[1]=a[2]=a[5]=a[7]=1;
			a[3]=a[4]=a[6]=2;
			for(;i<=n;i++) {
				if(i%7==0)a[i]=i/7;
				else a[i]=Math.min(a[i-5],Math.min(a[i-2],a[i-1]))+1;
			}
			r=a[n];
		}
		System.out.print(r);
	}
}