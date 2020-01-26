package BaekJoon;

import java.util.Arrays;

public class P11726 {

	public static void main(String[] args) {
		int i=2,s=1001,a[]=new int[s];
		a[1]=1;
		a[2]=2;
		for(;++i<s;a[i]=(a[i-1]+a[i-2])%10007);
//		System.out.println(Arrays.toString(a));
		System.out.print(a[new java.util.Scanner(System.in).nextInt()]);
	}
}