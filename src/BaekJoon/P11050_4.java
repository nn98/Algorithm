package BaekJoon;

import java.util.Scanner;

public class P11050_4 {

	static int F(int n){
		if(n<2)return 1;
		else return n*F(n-1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
//		if(k==0||n==k)System.out.println(0);
//		else 
			System.out.print(F(n)/(F(k)*F(n-k)));
	}

}