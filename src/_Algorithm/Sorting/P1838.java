package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1838 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,b[]=new int[n],j,r=0;
		for(;i<n;b[i]=a[i++]=s.nextInt());
		Arrays.sort(a);
		for(i=0;i<n;i++)
			for(j=n;j-->0;)
				if(a[i]==b[j])
					r=r>j-i?r:j-i;
					
					System.out.println(r);
	}

}