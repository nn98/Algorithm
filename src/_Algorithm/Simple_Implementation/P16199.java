package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P16199 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),e=s.nextInt(),f=s.nextInt();
		System.out.print((e>=b&f>=c?d-a:d-a-1)+"\n"+(d-a+1)+"\n"+(d-a));
	}

}
