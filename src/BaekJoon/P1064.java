package BaekJoon;

import java.util.*;
class P1064{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),X=s.nextInt(),Y=s.nextInt(),c=s.nextInt(),u=s.nextInt();
		double a=Math.hypot(X-c,Y-u),b=Math.hypot(c-x, u-y),C=Math.hypot(x-X,y-Y);
		System.out.println(a+" "+b+" "+C);
		String r="-1";
		if(!((X-x)*(u-y)==(Y-y)*(c-x)))r=String.format("%f",(Math.max(a,b>C?b:C)-Math.min(a,b<C?b:C))*2);
		System.out.print(r);
	}
}