package BaekJoon;

import java.util.Scanner;

public class P11050_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),r=0;
		if(0<=k&&k<=n) {
			r=n;
			for(int i=n-1;i>k;i--)r*=i;
			for(int i=2;i<=n-k;i++)r/=i;
		}
		System.out.print(r);
	}
}