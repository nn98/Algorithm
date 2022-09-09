package _Algorithm.DP;
import java.util.Arrays;
public class P20500_C {
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1;
		long a[]=new long[n+1],m=1000000007;
		a[0]=a[1]=1;
		for(;++i<n-1;a[i]=(a[i-2]*2+a[i-1])%m);
//		System.out.println(Arrays.toString(a));
		System.out.print(n<2?0:a[n-2]);
	}
}