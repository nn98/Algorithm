package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11052_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n+1],i=0,j;
		for(;i++<n;a[i]=s.nextInt());
		for(i=2;i<=n;i++) {
			for(j=1;j<=i-j;j++) {
				a[i]=a[i]>a[j]+a[i-j]?a[i]:a[j]+a[i-j];
				
			}
		}
		System.out.print(Arrays.toString(a));
	}
}