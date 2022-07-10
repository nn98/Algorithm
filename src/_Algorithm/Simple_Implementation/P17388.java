package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P17388 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,n=s.nextInt(),m=n,j=0,u=0;
		for(;i<3;i++) {
			n=s.nextInt();
			j=m<n?j:i;
			m=m<n?m:n;
		}
//		System.out.println(u>99?"OK":(j<1?"Soongsil":(j<2?"Korea":"Hanyang")));
		if(u>99)System.out.println("OK");
		else switch(j) {
		case 0:
			System.out.println("Soongsil");
			break;
		case 1:
			System.out.println("Korea");
			break;
		case 2:
			System.out.println("Hanyang");
		}
	}
}
