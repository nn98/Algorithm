package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P20922 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],d[]=new int[100001],i=0,j=0,r=0,v;
		for(;i<n;a[i++]=s.nextInt());
		for(;j<n;) {
			d[a[j]]++;
			for(;d[a[j]]>k;d[a[i++]]--);
			v=j-i+1;
			r=r>v?r:v;
		}
		System.out.println(r);
	}

}
