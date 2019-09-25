package BaekJoon;

import java.util.Scanner;

public class P2864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		int max=Integer.parseInt(a.replaceAll("5", "6"))+Integer.parseInt(b.replaceAll("5", "6")),min=Integer.parseInt(a.replaceAll("6", "5"))+Integer.parseInt(b.replaceAll("6", "5"));
		System.out.println(min+" "+max);
	}

}
