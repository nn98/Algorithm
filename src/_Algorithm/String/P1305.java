package _Algorithm.String;

import java.util.Scanner;

public class P1305 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,x,y,c,l=0;
		StringBuffer f=new StringBuffer(s.next());
		for(;i<f.length();i++)
			for(j=i+1;j<f.length();j++) {
				if(f.charAt(i)==f.charAt(j)) {
					x=i;
					y=j;
					c=1;
					while(x<j&c>0&y<f.length()) {
						if(f.charAt(x++)!=f.charAt(y++))c--;
					}
					l=j-i;
				}
			}
		System.out.println(l);
	}
}
//Knuth Morris Prett Alg?