package BaekJoon;

import java.util.Scanner;

public class P1188_S {

	public static void main(String[] args) {
		//실제를 상상하며 계산
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=b,d;
		for(;;) {
			d=a%b;
			if(d==0) {
				System.out.print(c-b);
				break;
			}
			a=b;
			b=d;
		}
	}
}