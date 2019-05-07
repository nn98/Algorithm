package BaekJoon;

import java.util.Scanner;

public class P11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a,b;
		for(int i=0;i<N;i++) {
			a=s.nextInt();
			b=s.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1 , a , b , a+b);
		} 
	}

}
