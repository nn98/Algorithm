package _Algorithm.DP;

public class P20500 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=-1,a[][]=new int[3][n],m=1000000007;
		a[0][1]=a[1][2]=1;
		for(;++i<n;a[0][i+1]=(a[1][i]+a[2][i])%m,a[1][i+1]=(a[0][i]+a[2][i])%m,a[0][i+1]=(a[0][i]+a[1][i])%m);
	}

}
