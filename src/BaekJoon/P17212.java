package BaekJoon;

import java.util.Scanner;

public class P17212 {

	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt(),i=0,c=0,a[]={7,5,2,1};
		while(n>0){
			c+=n/a[i];
			n%=a[i++];
		}
		System.out.print(c);
	}
}