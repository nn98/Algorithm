package _Algorithm.String.KMP;

import java.util.Scanner;

public class P23905 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,x,y,a[],r,j,k;
		for(;i++<n;) {
			x=s.nextInt();
			y=s.nextInt();
			a=new int[x+1];
			r=0;
			for(j=0;j<x;a[j++]=s.nextInt());
			for(j=0;j<x;j++)if(a[j]==y) {
//				System.out.println("j: "+j);
				for(k=j;++k<x&k-j<y&a[k]==a[k-1]-1;);
//				System.out.println(k);
				if(k-j==y)r++;
			}
			System.out.println("Case #"+i+": "+r);
		}
	}

}
