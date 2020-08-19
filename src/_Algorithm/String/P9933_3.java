package _Algorithm.String;

import java.util.Scanner;

public class P9933_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=n,j,l,r;
		s.nextLine();
		StringBuffer a[]=new StringBuffer[n],b;
		while(i-->0)a[i]=new StringBuffer(s.nextLine());
		for(i=0;i<n;i++) {
			l=a[i].length()-1;
			for(j=0;j<=i;j++) {
				if(a[i].length()==a[j].length()) {
					b=a[j].reverse();
					if(a[i].toString().equals(b.toString()))
						System.out.println(l+1+" "+a[i].charAt(l/2));
				}
			}
		}
	}
}