package BaekJoon;

import java.util.Scanner;

public class P2985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		if(a+b==c) System.out.print(a+"+"+b+"="+c);
		else if(a-b==c) System.out.print(a+"-"+b+"="+c);
		else if(a*b==c) System.out.print(a+"*"+b+"="+c);
		else if(a/b==c) System.out.print(a+"/"+b+"="+c);
		else if(a==b+c) System.out.print(a+"="+b+"+"+c);
		else if(a==b-c) System.out.print(a+"="+b+"-"+c);
		else if(a==b*c) System.out.print(a+"="+b+"*"+c);
		else if(a==b/c) System.out.print(a+"="+b+"/"+c);
	}
}
