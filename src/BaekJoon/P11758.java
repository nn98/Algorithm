package BaekJoon;

import java.util.Scanner;
public class P11758 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),e=s.nextInt(),f=s.nextInt(),r=a*d+c*f+e*b;
		r=r-b*c-d*e-f*a;
		if(r>0)r=1;
		else if(r<0)r=-1;
		else r=0;
		System.out.print(r);
	}
}