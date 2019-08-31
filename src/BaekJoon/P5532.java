package BaekJoon;

import java.util.Scanner;

public class P5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int l=s.nextInt(),a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
		while(!(a<=0&&b<=0)) {
			a-=c;
			b-=d;
			l--;
		}
		System.out.println(l);
	}

}
