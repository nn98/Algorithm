package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1377_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n+1],i=1,b[],r=0,j;
		for(;i<=n;a[i++]=s.nextInt());
		b=a.clone();
		Arrays.sort(b);
		for(i=0;i++<n;)
			for(j=0;j++<i;)
				if(a[i]==b[j]) {
					r=r>i-j?r:i-j;
					break;
				}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.print(r+1);
	}

}
