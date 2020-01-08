package BaekJoon;

import java.util.*;

public class P5576 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,j,a[][]=new int[2][10];
		for(;i<2;i++) {
			for(j=0;j<10;)
				a[i][j++]=s.nextInt();
			Arrays.sort(a[i]);
			System.out.print(a[i][9]+a[i][8]+a[i][7]+" ");
		}
	}
}