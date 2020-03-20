package BaekJoon;

import java.util.*;
public class P2997 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[3],i=0,n,m;
		for(;i<3;a[i++]=s.nextInt());
		Arrays.sort(a);
		n=a[1]-a[0];
		m=a[2]-a[1];
		System.out.println(n==m?n:(n<m?n:m));
	}
}