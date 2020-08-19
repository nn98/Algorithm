package _Algorithm.String;

import java.util.Scanner;

public class P9933_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,l,r;
		s.nextLine();
		StringBuffer[]a=new StringBuffer[n];
		while(n-->0) {
			a[i]=new StringBuffer(s.nextLine());
			l=a[i].length()-1;
			if(a[i].charAt(0)==a[i].charAt(l)) {
				r=0;
				for(j=0;j<l/2&&r==0;j++)
					if(a[i].charAt(j)!=a[i].charAt(l-j))
						r++;
				if(r==0) {
					System.out.print(l+1+" "+a[i].charAt(l/2));
					return;
				}
			}
			if(i>0) {
				for(j=0;j<i;j++) {
					if(a[j].charAt(0)==a[i].charAt(l))
						if(a[j].reverse().toString().equals(a[i].toString())) {
							System.out.print(l+1+" "+a[j].charAt(l/2));
							return;
						}
				}
			}
			i++;
		}
	}

}