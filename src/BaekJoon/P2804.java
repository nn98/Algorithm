package BaekJoon;

import java.util.Scanner;

public class P2804 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String A=s.next();
		char[]a=A.toCharArray(),b=s.next().toCharArray();
		int i=0,j,p=-1,q=-1;
		for(;i<a.length;i++) {
			if(p>=0)break;
			for(j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					p=i;
					q=j;
					break;
				}
			}
		}
		for(i=0;i<b.length;i++) {
			String o="";
			if(i==q)
				o=A;
			else {
			for(j=0;j<a.length;j++) {
				if(j==p)
					o+=b[i];
				else
					o+=".";
			}
			}
			System.out.println(o);
		}
	}

}
