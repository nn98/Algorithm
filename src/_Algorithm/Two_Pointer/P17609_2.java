package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P17609_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j,c;
		StringBuffer a=new StringBuffer(s.next()),b;
		i=a.length()/2;
		if(a.length()%2==1) {
			b=new StringBuffer(a.subSequence(i+1,i*2+1));
		}else b=new StringBuffer(a.subSequence(i,i*2));
		a=new StringBuffer(a.subSequence(0,i));
		b=b.reverse();
		System.out.println(a);
		System.out.println(b);
	}

}
