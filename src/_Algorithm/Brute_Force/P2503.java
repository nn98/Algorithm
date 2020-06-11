package _Algorithm.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class P2503 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,S,B,m,a[]=new int[3],b[][]=new int[3][10],c[][]=new int[3][10],r[]=new int[10]; 
		for(;n-->0;) {
			m=s.nextInt();
			a[0]=m/100;
			a[1]=m%100/10;
			a[2]=m%10;
			S=s.nextInt();
			B=s.nextInt();
			if(S==0&&B==0)
				for(i=0;i<3;r[a[i++]]=-1);
		}
		System.out.println(Arrays.toString(r));
	}

}
