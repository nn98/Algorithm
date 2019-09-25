package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P1252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		System.out.println(Math.pow(2, 80));
		Scanner s=new Scanner(System.in);
		String[] arr=s.nextLine().split(" ");
		long a=0,b=0;
		while(arr[0].charAt((int)a)=='0') {
			a++;
			if(arr[0].length()==a) {
				a=0;
				arr[0]="0";
				break;
			}
		}
		arr[0]=arr[0].substring((int)a);
		//		System.out.println(arr[0]);
		while(arr[1].charAt((int)b)=='0') {
			b++;
			if(arr[1].length()==b) {
				b=0;
				arr[1]="0";
				break;
			}
		}
		arr[1]=arr[1].substring((int)b);
		//		System.out.println(arr[1]);
		if(arr[0].equals("0")&&arr[1].equals("0")) {
			System.out.println(0);
			return;
		}
		a=0;
		b=0;
		BigInteger A=BigInteger.ZERO;
		BigInteger B=BigInteger.ZERO;
		for(int i=arr[0].length()-1;i>=0;i--) 
			if(arr[0].charAt((arr[0].length()-1)-i)=='1') A=A.add(new BigInteger(""+(int)Math.pow(2, i)));
		System.out.println(A);
		for(int i=arr[1].length()-1;i>=0;i--) 
			if(arr[1].charAt((arr[1].length()-1)-i)=='1') B=B.add(new BigInteger(""+(int)Math.pow(2, i)));
		System.out.println(B);
		//				System.out.println(a+" "+b);
		A=A.add(B);
		System.out.println(A);
		//		a=a+b;
		//		b=1;
		B=BigInteger.ONE;
		for(;A.compareTo(B)>=0;B=B.multiply(BigInteger.valueOf(2))) System.out.println(B);
		B=B.divide(BigInteger.valueOf(2));
		System.out.println(B);
		String r="";
		while(B.compareTo(BigInteger.ONE)>0) {
			r+=A.divide(B);
			A=A.mod(B);
			B=B.divide(BigInteger.valueOf(2));
		}
		r+=A.divide(B);
		System.out.println(r);
	}
}