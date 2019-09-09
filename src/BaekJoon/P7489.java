package BaekJoon;

import java.util.Scanner;

public class P7489 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String r="";
		for(int i=0;i<n;i++) {
			int m=s.nextInt();
			if(m==0) System.out.println(0);
			else {
				long sum=1;
				for(int j=1;j<=m;j++) {
					sum*=j;
//					System.out.println(sum);
					while(sum%10==0) sum/=10;
//					System.out.println(sum);
					sum%=1000000000;
//					System.out.println(sum);
				}
				sum%=10;
				r+=sum+"\n";
			}
		}
		System.out.println(r);
	}
}
