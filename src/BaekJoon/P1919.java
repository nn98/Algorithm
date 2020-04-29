package BaekJoon;

import java.util.Scanner;

public class P1919 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]a=s.next().split(""),b=s.next().split("");
		int i=0,j=b.length-1,k,c=0;
		for(;i<a.length;i++) {
			for(k=j;k>=0;k--) {
				if(a[i].equals(b[k])) {
					j=k-1;
					c++;
				}
			}
		}
		System.out.println(c);
	}

}
