package BaekJoon;

import java.util.Scanner;
public class P15820 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0;
		boolean a=true,b=true;
		String r;
		for(;i++<n&&a;a=s.nextInt()==s.nextInt());
		for(i=0;i++<m&&b;b=s.nextInt()==s.nextInt());
		if(a&&b)r="Accepted";
		else if(a)r="Why Wrong!!!";
		else r="Wrong Answer";
		System.out.print(r);
	}
}
