package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P2559 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=0,j=0,r=0,a[]=new int[n],R=0;
		for(;i<n;a[i++]=s.nextInt());
		for(i=0;i<n-k;r+=a[j++]) {
			if(j-i==k) {
				R=r>R?r:R;
				r-=a[i++];
			}
		}
		System.out.println(R);
	}

}
