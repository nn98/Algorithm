package BaekJoon;

import java.util.Scanner;

public class P2246 {

	static int n,a[],b[],r=0,i=0,j;
	static void o(int x) {
		boolean f=true,c=true,d=true;
		for(j=0;j<n&&(c||d);j++) {
			if(j==x)continue;
			if(f){
				c=(a[j]<a[x]&&b[j]>b[x]);
				d=(a[j]>a[x]&&b[j]<b[x]);
				System.out.println(c+" "+d);
				f=false;
			}
			if(c)c=(a[j]<a[x]&&b[j]>b[x]);
			if(d)d=(a[j]>a[x]&&b[j]<b[x]);
		}
		if(c||d)r++;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=b=new int[n];
		for(;i<n;a[i]=s.nextInt(),b[i++]=s.nextInt());
		for(;i-->0;o(i));
		System.out.print(r);
	}
}