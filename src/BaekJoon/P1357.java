package BaekJoon;

import java.util.Scanner;

public class P1357 {
	//아니 이시발련아 String으로 출력했다고 틀리네 뒤질라고
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
		System.out.println(Integer.parseInt(sol(""+(Integer.parseInt(x)+Integer.parseInt(y)))));
	}

}
