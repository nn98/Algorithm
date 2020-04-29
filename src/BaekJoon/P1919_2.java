package BaekJoon;

import java.util.Scanner;

public class P1919_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]a=s.next().split(""),b=s.next().split("");
		int i=0,j,r=0,A=a.length,B=b.length;
		for(;i<A;i++)
			for(j=0;j<B;j++)
				if(a[i].equals(b[j])&&!a[i].equals("")) {
					r+=2;
					a[i]=b[j]="";
				}
		System.out.print(A+B-r);
	}
}