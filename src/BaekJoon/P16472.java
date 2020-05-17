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
			c=0;
			for(j=i;c<n;j++) {
				if(a[j+1]!=a[j])c++;
				
			}
			System.out.println("i: "+i+" j: "+j);
			
//			while(c<=n) {
//				if(j>=a.length)break;
//				if(!b[a[j]-'a']) {
//					c++;
//					b[a[j]-'a']=true;
//				}
//				j++;
//			}
			m=m>j-i?m:j-1;
			for(j=i+1;j<a.length&&a[j-1]==a[j];j++);
			i=j;
		}
		System.out.print(m-1);
	}

}
