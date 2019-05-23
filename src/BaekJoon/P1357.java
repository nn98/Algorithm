package BaekJoon;

import java.util.Scanner;

public class P1357 {

	static String sol(String s) {
		String r="";
		String[] a=s.split("");
		for(int i=a.length-1;i>=0;i--) r+=a[i];
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String x=sol(""+s.nextInt()),y=sol(""+s.nextInt());
//		System.out.println(x+" "+y);
		System.out.println(sol(""+(Integer.parseInt(x)+Integer.parseInt(y))));
	}

}
