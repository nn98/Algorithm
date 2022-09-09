package _Algorithm.DP;

public class P13699 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j;
		long a[]=new long[36],u;
		a[0]=a[1]=1;
		for(;++i<=n;) {
			u=0;
			for(j=0;j++<i;u+=a[j-1]*a[i-j]);
			a[i]=u;
		}
		System.out.println(a[n]);
	}

}
