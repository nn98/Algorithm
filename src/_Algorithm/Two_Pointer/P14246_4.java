package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P14246_4 {

	static int n,a[],t[],l=1,i,j,r;
	static void o() {
		while(j>1)t[j/=2]=t[j*2]+t[j*2+1];
	}
	static int p(int n,int s,int e) {
		if(s>=i&e<=j)return t[n];
		if(j<s|i>e)return 0;
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;l<=n;l*=2);
		t=new int[l];
		l/=2;
		for(;i<n;j=l+i++,t[j]=s.nextInt(),o());
		System.out.println(Arrays.toString(t));
		i=1;
		j=n;
		System.out.println(p(1,1,n));
	}

}
