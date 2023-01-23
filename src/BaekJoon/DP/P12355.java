package BaekJoon.DP;

import java.util.Scanner;

public class P12355 {
	static int n,m,i,j,a[],r,h[];
	static int o(int x,int c) {
//		System.out.println(x+" "+v);
//		for(int i=0;i<c;i++,System.out.print("\t"));
//		System.out.println(x);
		for(int i=x;++i<m;)if(a[i]>a[x]) {
//			System.out.println("\tgo: "+i);
			h[x]=Math.max(h[x],(h[i]>0?h[i]:o(i,c+1)));
		}
		h[x]++;
//		System.out.println(Arrays.toString(h));
		r=r>h[x]?r:h[x];
		return h[x];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i++<n;) {
			m=s.nextInt();
			a=new int[m];
			h=new int[m];
			r=0;
			for(j=0;j<m;a[j++]=s.nextInt());
			for(;j-->0;o(j,0));
//			System.out.println(Arrays.toString(h));
			System.out.println("Case #"+i+": "+(m-r));
		}
	}
}
