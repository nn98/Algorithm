package BaekJoon;

import java.util.Scanner;

public class P10707 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),p=s.nextInt()
				,X=a*p,Y=p<=c?b:b+(p-c)*d;
		System.out.print(X<Y?X:Y);
		
	}
}