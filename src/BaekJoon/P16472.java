package BaekJoon;

import java.util.Scanner;

public class P16472 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,c,j,m=0;
		char[]a=s.next().toCharArray();
		boolean[]b;
		for(;i<a.length;) {
			b=new boolean[26];
			j=c=0;
			while(c<n) {
				if(!b[a[j]-'a']) {
					c++;
					b[a[j]-'a']=true;
				}
				j++;
			}
			System.out.println("i: "+i);
			System.out.println("j: "+j);
			m=m>j-i?m:j-1;
			for(j=i+1;j<a.length&&a[j-1]==a[j++];);
			i=j;
		}
		System.out.print(m-1);
	}

}
