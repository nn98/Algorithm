package BaekJoon;

import java.util.Scanner;

public class P1629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		String pt="",in="";
		boolean p=true;
		for(int i=0;i<b;i++) {
			a*=a;
			a%=c;
			if(p) pt+=a;
			else in+=a;
			if(a==pt.charAt(0)-'0') p=false;
		}
		System.out.println(pt+" "+in);
	}
}