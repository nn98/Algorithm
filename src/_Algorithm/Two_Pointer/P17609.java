package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P17609 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,x,y,c;
		for(;i++<n;) {
			char[]a=s.next().toCharArray();
			c=x=0;
			y=a.length-1;
			for(;x<y&c<2;) {
				if(a[x]!=a[y]) {
					if(a[x+1]==a[y])x++;
					else if(a[x]==a[y-1])y--;
					else c=1;
					c++;
				}
				x++;
				y--;
			}
			System.out.println(c);
		}
	}

}
