package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2331 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[1000],p,i=0,j,k=1,q;
		a[i++]=s.nextInt();
		p=s.nextInt();
		for(;i<20;) {
			q=0;
			j=a[i-1];
			for(k=1;k<=j;k*=10);
			System.out.println(k);
			for(;k>1;k/=10,q+=j/k*p,q%=k);
			System.out.println(" "+q);
			a[i++]=q;
			for(;k<i;k++)if(a[k]==a[i-1])break;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(k);
	}

}