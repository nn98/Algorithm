package BaekJoon;

import java.util.Scanner;

public class P1049 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[2],am=Integer.MAX_VALUE,bm=Integer.MAX_VALUE;
		for(int i=0;i<m;i++) {
			a[0]=s.nextInt();
			am=am<a[0]?am:a[0];
			a[1]=s.nextInt();
			bm=bm<a[1]*n?bm:a[1]*n;
		}
		System.out.print(am<bm?am:bm);
	}

}