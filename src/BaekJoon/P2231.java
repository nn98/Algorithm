package BaekJoon;

import java.util.Scanner;

public class P2231 {
	//자기 자신이 생성자인 경우까지
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int sum=0;
			for(int j=1;j<=i;j*=10) {
				sum+=i%(j*10)/j;
			}
//			System.out.println(i+" "+sum);
			if(sum+i==n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");
	}
}