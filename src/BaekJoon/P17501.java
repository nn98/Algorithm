package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P17501 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,m=0,r=0;
		for(;i<n;a[i++]=s.nextInt());
		s.nextLine();
		for(;i-->1;) {
			String j=s.nextLine().substring(0,1);
			if(j.equals("-"))m++;
		}
		Arrays.sort(a);
		for(i=0;i<n;i++) {
			if(m!=0) {
				r-=a[i];
				m--;
			}
			else r+=a[i];
		}
		System.out.print(r);
	}

}
