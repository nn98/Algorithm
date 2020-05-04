package BaekJoon;

import java.util.Scanner;

public class P2530 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h=s.nextInt(),m=s.nextInt(),n=s.nextInt(),a=s.nextInt();
		h+=a/3600;
		a%=3600;
		m+=a/60;
		a%=60;
		n+=a;
		if(n>=60) {
			m++;
			n%=60;
		}
		if(m>=60) {
			h++;
			m%=60;
		}
		if(h>=24) {
			h%=24;
		}
	}

}
