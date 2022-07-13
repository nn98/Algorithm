package _Algorithm.DP;
//https://www.acmicpc.net/problem/2631
//줄세우기
import java.util.*;

public class P18353 {
	static int n,m,i,j,a[],h[];
	static void o(int x) {
		for(int i=x;++i<n;) {
			if(a[i]<a[x])h[x]=Math.max(h[x],h[i]);
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
		System.out.println(Arrays.toString(h));
		System.out.println(n-m);
	}

}
