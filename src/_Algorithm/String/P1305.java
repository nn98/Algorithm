package _Algorithm.String;

import java.util.Scanner;

public class P1305 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,x,y,c,l=0;
		s.next();
		StringBuffer f=new StringBuffer(s.next());
		for(;i<f.length();i++,System.out.println(1))
			for(j=i+1;j<f.length();j++,System.out.println(2)) {
				if(f.charAt(i)==f.charAt(j)) {
					x=i;
					y=j;
					c=1;
					while(x<j&c>0) {
						System.out.println(3);
						if(f.charAt(x++)!=f.charAt(y++))c--;
					}
					l=j-i;
				}
			}
		System.out.println(l);
	}

}
