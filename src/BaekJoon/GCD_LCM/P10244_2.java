package BaekJoon.GCD_LCM;

import java.util.*;

public class P10244_2 {
	static int t;
	static int o(int a,int b) {
		while(b>0) {
			t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i=0,j,m,a[],b[];
		while((n=s.nextInt())!=0) {
			Set<Integer> t=new HashSet();
			a=new int[n+1];
			b=new int[n+1];
			for(;i++<n;t.add(a[i]=s.nextInt()),t.add(b[i]=o(a[i-1],a[i])));
			for(;--i>0;) {
				m=a[i];
				for(j=i;++j<=n;t.add(m=o(m,a[j])));
			}
			System.out.println(t.size());
		}
	}

}