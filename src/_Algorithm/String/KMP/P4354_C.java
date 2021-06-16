package _Algorithm.String.KMP;

import java.util.Scanner;

public class P4354_C {

	static char[]c;
	static int p[],i,j,l;
	static void o() {
		l=c.length;
		i=1;
		j=0;
		while(i+j<l) {
			if(c[i+j]==c[j]) {
				p[i+j-1]=++j;
			}else {
				if(j==0)i++;
				else {
					i+=j-p[j-1];
					j=p[j-1];
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String z;
		while(!(z=s.next()).equals(".")) {
			c=z.toCharArray();
			o();
		}
	}

}
