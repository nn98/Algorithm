package insert;

import java.util.Scanner;

public class P2083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in="";
		int age=1,weight=1;
		while(true) {
			in=s.next();
			age=s.nextInt();
			weight=s.nextInt();
			if(in.equals("#")) break;
			if(age>17||weight>79) {
				System.out.println(in+" Senior");
			} else System.out.println(in+" Junior");
		}
	}

}
