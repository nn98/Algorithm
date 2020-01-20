package BaekJoon;

import java.util.Scanner;

public class P2246_2 {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],b[]=new int[n],r=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			b[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			boolean c=true;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					System.out.println(a[i]<a[j]&&b[i]>b[j]);
					System.out.println(a[i]>a[j]&&b[i]<b[j]);
					c=(a[i]<a[j]&&b[i]>b[j])||(a[i]>a[j]&&b[i]<b[j]);
				}
			}
			if(c)r++;
		}
		System.out.println(c);
	}
}