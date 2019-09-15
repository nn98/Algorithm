package BaekJoon;

import java.util.Scanner;

public class P1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),count=0;
		for(int i=1;;i++) {
			String in=String.valueOf(i);
			boolean c=true;
			for(int j=0;j<in.length()-1;j++) {
				if(!(in.charAt(j)>in.charAt(j+1))) {
					c=false;
					break;
				}
			}
			if(c) {
				count++;
				if(count==n) {
					System.out.print(i);
					return;
				}
			}
		}
	}
}