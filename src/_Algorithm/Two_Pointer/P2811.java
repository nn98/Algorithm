package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P2811 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j=0,k,J=0,V=0;
		for(;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]<0) {
				j++;
				if(j>=V) {
					J=i;
					V=j;
				}
			}else j=0;
			System.out.println("V: "+V+" J: "+J);
		}
	}

}
