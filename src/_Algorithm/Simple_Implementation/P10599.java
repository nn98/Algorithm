package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P10599 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;;) {
			int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
			if(a==0&b==0&c==0&d==0)break;
			System.out.println(c-b+" "+(d-a));
		}
	}

}
