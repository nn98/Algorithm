package BaekJoon;

import java.util.Scanner;

public class P11655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuilder in=new StringBuilder(s.nextLine());
		for(int i=0;i<in.length();i++) {
			char j=in.charAt(i);
			if (64<j&&j<91) {
				int t=j+13;
				if(t>90) t=64+(t%90);
				in.setCharAt(i,(char)t);
			}
			else if (96<j&&j<123) {
				int t=j+13;
				if(t>122) t=96+(t%122);
				in.setCharAt(i,(char)t);
			}
		}
		System.out.println(in);
	}
}
