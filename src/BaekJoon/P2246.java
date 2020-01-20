package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//TMThink
public class P2246 {

	static int n,a[],b[],r=0,i=0,j;
	static void o(int x) {
		boolean f=true,c=true;
		for(int j=0;j<n&&c;j++) {
			if(j==x)continue;
			if(f){
				c=(a[j]<a[x]&&b[j]>b[x])||(a[j]>a[x]&&b[j]<b[x]);
				f=false;
			}
			c=(a[j]<a[x]&&b[j]>b[x])||(a[j]>a[x]&&b[j]<b[x]);
			System.out.println("a[j]<a[x]"+(a[j]<a[x]));
			System.out.println("b[j]>b[x]"+(b[j]>b[x]));
			System.out.println("a[j]>a[x]"+(a[j]>a[x]));
			System.out.println("b[j]<b[x]"+(b[j]<b[x]));
		}
		if(c)r++;
		else System.out.println(j+" "+a[x]+" "+a[j]+" "+b[x]+" "+b[j]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
//		a=b=new int[n]; is equal arr
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i]=s.nextInt(),b[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(;i-->0;o(i));
		System.out.print(r);
	}
}