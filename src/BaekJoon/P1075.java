package BaekJoon;

import java.util.Scanner;

public class P1075 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int n=s.nextInt(),f=s.nextInt(),c=n%f;
//		System.out.println(f-c);
		String n=s.nextLine();
		n=n.substring(0,n.length()-2)+"00";
		int f=s.nextInt(),N=Integer.parseInt(n);
		while(N%f!=0)N++;
		n=""+N;
		System.out.print(n.substring(n.length()-2,n.length()));
	}

}
