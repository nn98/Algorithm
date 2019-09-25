package BaekJoon;

import java.util.Scanner;

public class P11816_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.next();
		int r=0;
//		if(in.length()<3)
		if(in.substring(0,2).equals("0x")) {
			for(int i=in.length()-1;i>1;i--) {
				char t=in.charAt(i);
				if(t>='a'&&t<='f') t=(char) ((t-'a')+10);
				else if(t>='0'&&t<='9') t-='0';
				int c=in.length()-1-i;
				r+=t*Math.pow(16, c);
			}
		}
		else if(in.substring(0,1).equals("0")) {
			for(int i=in.length()-1;i>0;i--) {
				char t=(char) (in.charAt(i)-'0');
				int c=in.length()-1-i;
				r+=t*Math.pow(8, c);
			}
		}
		else r=Integer.parseInt(in);
		System.out.println(r);
	}
}
