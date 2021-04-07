package _Algorithm.BackTracking;

import java.util.Scanner;

public class P1759 {

	static int n,m,i,c[];
	static char[]a,b;
	
	static void o(int x) {
		if(x<n) {
			for(int i=0;i<m;i++)
				if(c[i]<1) {
					c[i]++;
					b[x]=a[i];
					o(x+1);
					c[i]--;
				}
		}else System.out.println(b);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		c=new int[m];
		b=new char[m];
		a=new char[m];
		for(;i<m;a[i++]=s.next().charAt(0));
		o(0);
	}

}
