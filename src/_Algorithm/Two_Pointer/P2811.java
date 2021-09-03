package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P2811 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j=0,I=0,k=0,J=0,V=0;
		for(;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]<0) {
				I=j==0?i:I;
				j++;
				if(j>=V) {
					J=I;
					V=j;
				}
			}else {
				if(I-j*2<0)k+=I;
				else k+=j*2;
				j=0;
			}
//			System.out.println(k);
		}
		if(j>0) {
			if(I-j*2<0)k+=I;
			else k+=j*2;
		}
		i=J-V*2;
		if(i>=0) {
			if(i-V<0)k+=i;
			else k+=V;
		}
//		System.out.println("V: "+V+" J: "+J+" k: "+k);
		System.out.println(k);
	}

}
