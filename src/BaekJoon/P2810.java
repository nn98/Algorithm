package BaekJoon;

import java.util.Scanner;

public class P2810 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=1,i=0;
		char[]a=s.next().toCharArray();
		for(;i<a.length;i++) {
			if(a[i]=='L')i++;
			r++;
		}
		System.out.print(r<n?r:n);
	}
}