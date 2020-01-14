package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P3029 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]a=s.next().split(":"),b=s.next().split(":");
//		System.out.println(Arrays.toString(a));
		int t[]=new int[3],i=3,f=0,A,B;
		for(;--i>=0;) {
			A=Integer.parseInt(a[i]);
			System.out.println(A);
			B=Integer.parseInt(b[i]);
			if(f==1) {
				f=0;
				B--;
			}
			t[i]=B-A;
			System.out.println(t[i]+A+B);
			if(t[i]<0) {
				if(i==0)t[i]+=24;
				else t[i]+=60;
				f=1;
			}
		}
		for(;++i<3;System.out.printf("%02d"+(i==2?"":":"),t[i]));
	}
}