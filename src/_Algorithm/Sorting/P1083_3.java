package _Algorithm.Sorting;

import java.util.Scanner;

public class P1083_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,b,c,t;
		for(;i<n;a[i++]=s.nextInt());
		i=s.nextInt();
		while(i>0) {
			t=0;
			for(j=1;j<n;j++)
				if(a[j]>a[t])
					if(j<=i)
						t=j;
				
		}
	}

}
