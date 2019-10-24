package BaekJoon;

import java.util.Scanner;

public class P10409 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),u=s.nextInt(),i=1;
		for(;i<=n;i++) {
			u-=s.nextInt();
			if(u<0)break;
		}
		System.out.print(i-1);
	}

}
