package _Algorithm.Sorting;

import java.util.Scanner;

public class P1838_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),j=500001,a[]=new int[j],i=0,r=0,c=0;
		for(;i++<n;a[s.nextInt()]=i);
		for(i=0;++i<j;c+=a[i]==0?0:1,r=r>a[i]-c?r:a[i]-c);
		System.out.println(r);
	}
}