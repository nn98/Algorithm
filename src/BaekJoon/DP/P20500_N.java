package BaekJoon.DP;
public class P20500_N {
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,a[][]=new int[3][n],m=1000000007;
		if(n<2) {
			System.out.println(0);
			return;
		}
		a[0][1]=a[1][1]=1;
		for(;i<n-1;i++) {
			a[0][i+1]=(a[1][i]+a[2][i])%m;
			a[1][i+1]=(a[0][i]+a[2][i])%m;
			a[2][i+1]=(a[0][i]+a[1][i])%m;
		}
		System.out.println(a[0][n-1]);
	}
}