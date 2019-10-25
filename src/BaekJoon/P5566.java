package BaekJoon;

import java.util.Scanner;

public class P5566 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],w=0,i=0;
		for(;i<n;i++)
			a[i]=s.nextInt();
		n--;
		for(i=0;i<m&&w<n;i++) {
//			System.out.println(w);
			w+=s.nextInt();
			if(w>=n) {
				i++;
				break;
			}
			w+=a[w];
		}
		System.out.println(i);
	}
}
