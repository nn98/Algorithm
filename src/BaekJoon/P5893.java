package BaekJoon;

import java.util.Scanner;
public class P5893 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.next(),r=in+"0000",result="";
		boolean b=false;
		int index=in.length()-1;
//		System.out.println(r);
//		System.out.println("    "+in);
		for(int i=r.length()-1;i>=0;i--) {
			if(index<0) {
//				System.out.println(r.charAt(i));
				if(b&&r.charAt(i)=='1') result+="0";
				else if(b&&r.charAt(i)=='0') {
					b=false;
					result+="1";
				}
				else if(r.charAt(i)=='1') result+="1";
				else result+=r.charAt(i);
			}
			else {
				if(b&&r.charAt(i)=='1'&&in.charAt(index)=='1') {
					result+="1";
				}
				else if((b&&r.charAt(i)=='1')||(b&&in.charAt(index)=='1')||(in.charAt(index)=='1'&&r.charAt(i)=='1')) {
					b=true;
					result+="0";
				}
				else if((b&&in.charAt(index)=='0')||(b&&r.charAt(i)=='0')) {
					b=false;
					result+="1";
				}
				else if((in.charAt(index)=='1'&&r.charAt(i)=='0')||(in.charAt(index)=='0'&&r.charAt(i)=='1')) {
					result+="1";
				}
				else result+="0";
				index--;
			}
		}
		StringBuilder sb=new StringBuilder(result);
		System.out.println(sb.reverse());
	}
}