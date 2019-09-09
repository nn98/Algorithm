package BaekJoon;

import java.util.Scanner;

public class P1550 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.next();
		int r=0;
		for(int i=in.length()-1;i>=0;i--) {
			char t=in.charAt(i);
			switch(t) {
			case 'A':
				r+=10*Math.pow(16, (in.length()-1)-i);
				break;
			case 'B':
				r+=11*Math.pow(16, (in.length()-1)-i);
				break;
			case 'C':
				r+=12*Math.pow(16, (in.length()-1)-i);
				break;
			case 'D':
				r+=13*Math.pow(16, (in.length()-1)-i);
				break;
			case 'E':
				r+=14*Math.pow(16, (in.length()-1)-i);
				break;
			case 'F':
				r+=15*Math.pow(16, (in.length()-1)-i);
				break;
			default:
				r+=(t-'0')*Math.pow(16, (in.length()-1)-i);
			}
		}
		System.out.println(r);
	}
}
