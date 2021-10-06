package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P14246_4 {

	static int n,a[],t[],l=1,i,j,r;
	static void o() {
		while(j>0)t[j/=2]=t[j*2]+t[j*2+1];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;l<=n;l*=2);
		t=new int[l];
		l/=2;
		for(;i<n;j=l+i++,t[j]=s.nextInt(),o());
		System.out.println(Arrays.toString(t));
	}

}
