package BaekJoon;

import java.util.Scanner;

public class P5032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int e=s.nextInt()+s.nextInt(),c=s.nextInt(),sum=0;
//		System.out.println(e);
		while(!(e<c)) {
			int add=e/c;
			e%=c;
			e+=add;
			sum+=add;
//			System.out.println(e+" "+sum);
		}
		System.out.println(sum);
	}

}
