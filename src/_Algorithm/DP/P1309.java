package _Algorithm.DP;

public class P1309 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=0,j,a[]=new int[n+1];
		a[0]=3;
		a[1]=7;
		for(;i<n;a[i]=(a[i-1]*2+a[i++-2])%9901);
		System.out.print(a[n]);
	}

}
