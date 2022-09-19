package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P5613 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(;;)switch(s.next()) {
		case"+":
			a+=s.nextInt();
			break;
		case"-":
			a-=s.nextInt();
			break;
		case"*":
			a*=s.nextInt();
			break;
		case"/":
			a/=s.nextInt();
			break;
		case"=":
			System.out.println(a);
			return;
		}
	}

}
