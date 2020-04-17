package BaekJoon;

import java.util.Scanner;
public class P17874 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		System.out.print(Math.max(a-b,b)*Math.max(a-c,c)*4);
	}
}