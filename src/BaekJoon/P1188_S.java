package BaekJoon;

import java.util.Scanner;

public class P1188_S {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=b,d;
		for(;;) {
			d=a%b;
			if(d==0)System.out.print(c-b);
			a=b;
			b=d;
		}
	}
}