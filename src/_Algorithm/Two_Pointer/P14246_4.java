package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P14246_4 {

	static int n,a[],t[],l=1,i,j,r,k;
	static void o() {
		while(j>1)t[j/=2]=t[j*2]+t[j*2+1];
	}
	static int p(int n,int s,int e) {
		if(i<=s&e<=j)return t[n];
		if(j<s|e<i)return 0;
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;l<n;l*=2);
		t=new int[l*2];
		for(;i<n;j=l+i++,t[j]=s.nextInt(),o());
		k=s.nextInt();
		System.out.println(Arrays.toString(t));
//		System.out.println(i+" "+j+" : "+p(1,0,l-1))
		for(i=0;i<n;i++)
			for(j=i;j<n;r+=p(1,0,l-1)>k?1:0,j++);
	}

}
