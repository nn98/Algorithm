package BaekJoon;

import java.util.Scanner;

public class P17212_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]= {7,5,2,1},r=0;
		for(int i=0;i<a.length;i++) {
			r+=n/a[i];
			n%=a[i];
			if(n==0)break;
		}
		System.out.println(r);
	}

}
