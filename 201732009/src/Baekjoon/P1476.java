package Baekjoon;

import java.util.Scanner;

public class P1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int E=s.nextInt(),S=s.nextInt(),M=s.nextInt(),
				a=0,b=0,c=0;
		for(int i=1;;i++) {
//			System.out.println(a+" "+b+" "+c);
			a++;
			if(a==16) a=1;
			b++;
			if(b==29) b=1;
			c++;
			if(c==20) c=1;
			if(a==E&&b==S&&c==M) {
				System.out.println(i);
				break;
			}
		}
	}
}
