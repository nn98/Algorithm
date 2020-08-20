package _Algorithm.Sorting;

import java.util.Scanner;

public class P1083 {

	static int n,a[],i,b,c,j,t;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=s.nextInt();i>0;) {
			j=0;
			for(b=0;b<n-2&&i>0;b++)
				for(c=b;c<n-1&&i>0;c++)
					if(a[c]<a[c+1]) {
						t=a[c];
						a[c]=a[c+1];
						a[c+1]=t;
						j++;
						i--;
					}
		}
		for(int m:a)System.out.print(m+" ");
	}

}
