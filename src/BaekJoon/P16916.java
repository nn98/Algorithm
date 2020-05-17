package BaekJoon;

import java.util.Scanner;

public class P16916 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
		int i=0,j,r,A=a.length,B=b.length,c=0;
		for(;i<A&&c==0;i++)
			if(a[i]==b[0]) {
				r=0;
				for(j=0;i+j<A&&j<B;j++)
					if(a[i+j]==b[j])r++;
					else break;
				if(r==B)c++;
			}
		System.out.print(c);
	}

}
