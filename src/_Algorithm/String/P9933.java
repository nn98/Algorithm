package _Algorithm.String;

import java.util.Scanner;

public class P9933 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,l;
		s.nextLine();
		StringBuffer[]a=new StringBuffer[n];
		while(n-->0) {
			a[i]=new StringBuffer(s.nextLine());
			if(i>0) {
				for(j=0;j<i;j++) {
					l=a[i].length();
					if(a[j].charAt(0)==a[i].charAt(l-1))
						if(a[j].reverse().toString().equals(a[i].toString())) {
							System.out.print(l+" "+a[j].charAt(l/2));
							return;
						}
				}
			}
			i++;
		}
	}

}
