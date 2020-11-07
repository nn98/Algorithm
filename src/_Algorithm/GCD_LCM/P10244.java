package _Algorithm.GCD_LCM;

import java.util.*;

public class P10244 {

	static int t;
	static int o(int a,int b) {
		System.out.println(a+" "+b);
		while(b>0) {
			t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Set<Integer> t=new HashSet();
		int n,i=0,j,m,a[],b[];
		while((n=s.nextInt())!=0) {
			a=new int[n+1];
			b=new int[n+1];
			for(;i++<n;t.add(a[i]=s.nextInt()),t.add(b[i]=o(a[i-1],a[i])));
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(a));
			System.out.println(t.toString());
		}
	}

}
