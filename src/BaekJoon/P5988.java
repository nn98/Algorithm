package BaekJoon;

import java.util.Scanner;

public class P5988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String a=s.nextLine();
			a=a.substring(a.length()-1,a.length());
			if(a.equals("0")||a.equals("2")||a.equals("4")||a.equals("6")||a.equals("8")) System.out.println("even");
			else if(a.equals("1")||a.equals("3")||a.equals("5")||a.equals("7")||a.equals("9")) System.out.println("odd");
		}
	}
}
