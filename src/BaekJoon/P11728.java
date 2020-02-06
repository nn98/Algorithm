package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11728 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j=0,a[]=new int[n],b[]=new int[m],r;
		for(;i<n;a[i++]=s.nextInt());
		for(;j<m;b[j++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		i=j=0;
		while(i<n&&j<m) {
			if(i==n)r=b[j++];
			else if(j==m)r=a[i++];
			else {
				r=a[i]<b[j]?a[i++]:b[j++];
			}
			System.out.print(r+" ");
		}
	}
}