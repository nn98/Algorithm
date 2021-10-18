package _Algorithm.Two_Pointer;

import java.util.Scanner;
public class P2559 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=0,j=0,r=0,a[]=new int[n],R=Integer.MIN_VALUE;
		for(;i<n;i++) {
			r+=a[i]=s.nextInt();
			if(i-j==k-1) {
				R=r>R?r:R;
				r-=a[j++];
			}
		}
		System.out.print(R);
	}
}