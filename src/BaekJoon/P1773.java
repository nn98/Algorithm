package BaekJoon;

import java.util.Scanner;

public class P1773 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),r=0;
		boolean[]a=new boolean[m+1];
		for(int i=0;i<n;i++) {
			int t=s.nextInt(),j=t;
			for(;j<=m;j+=t)
				a[j]=true;
		}
		for(boolean c:a)if(c)r++;
		System.out.print(r);
	}

}
