package BaekJoon;

import java.util.Scanner;

public class P2331 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10000],p,i=0,j,k,q;
		a[i++]=s.nextInt();
		p=s.nextInt();
		for(;;) {
			q=0;
			j=a[i-1];
			for(k=1;k<=j;k*=10);
			for(;k>1;k/=10,q+=j/k*p,q%=k);
			a[i++]=q;
			for(;k<i;k++)if(a[k]==a[i-1])break;
		}
		System.out.println(k);
	}

}
