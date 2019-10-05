package BaekJoon;

import java.util.Scanner;

public class P17497_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=1,op=1;
		long i=s.nextLong();
		StringBuilder sb=new StringBuilder();
		for(;i!=2;) {
//			System.out.println(i);
			if(i==1) {
				System.out.println("4\n" + 
						"[+] [*] [-] [/]");
				break;
			}
			if(i/2%2==1) {
				i+=2;
				op++;
				sb.append("]-[ ");
			}
			i/=2;
			op++;
			sb.append("]*[ ");
		}
		sb.append("]+[");
		if(op>99)System.out.print(-1);
		else {
			System.out.println(op);
		System.out.println(sb.reverse());
		}
	}

}
