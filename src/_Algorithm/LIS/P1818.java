package _Algorithm.LIS;
import java.util.Scanner;

public class P1818 {
	static int n,m,i,j,a[],h[];
	static void o(int x) {
		for(int i=x;++i<n;) {
			if(a[i]>a[x])h[x]=Math.max(h[x],h[i]);
		}
		h[x]++;
		m=m>h[x]?m:h[x];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(;i-->0;o(i));
		System.out.println(n-m);
	}

}