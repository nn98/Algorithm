package BaekJoon;

import java.util.Scanner;

public class P10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		while(true) {
			a=s.nextInt();
			b=s.nextInt();
			if((a==0&&b==0)) break;
			System.out.println(a+b);
		} 
	}

}
