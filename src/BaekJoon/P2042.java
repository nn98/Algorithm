package BaekJoon;

import java.util.Scanner;

public class P2042 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),k=s.nextInt(),a[]=new int[n];
		for(int i=0;i<n;i++)a[i]=s.nextInt();
		for(int i=0;i<m+k;i++) {
			if(s.nextInt()==1) {
				a[s.nextInt()-1]=s.nextInt();
			}
			else {
				int d=s.nextInt()-1,b=s.nextInt(),r=0;
				for(;d<b;d++)r+=a[d];
				System.out.println(r);
			}
		}
	}
}
