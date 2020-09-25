package _Algorithm.DP;
public class P1699_2{
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j,a[]=new int[n+1];
		for(;i<=n;a[i]=i++);
		for(i=2;i<=n;i++)
			for(j=2;j*j<=i;j++)
				a[i]=Math.min(a[i],a[i-j*j]+1);
		System.out.print(a[n]);
	}
}