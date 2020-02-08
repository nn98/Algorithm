package BaekJoon;

import java.util.Scanner;

public class P7806 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			int n=s.nextInt(),m=s.nextInt(),M=m,i=2,j,r=1;
			for(;i*i<=M;i++) {
				int P=0;
				while(m%i==0) {
					m/=i;
					P++;
				}
				if(P>0) {
					int Q=0;
					for(j=i;j<=n;j*=i)Q+=n/j;
					for(j=0;j<(P<Q?P:Q);j++)r*=i;
				}
				if(m<i)break;
			}
			if(m>1&&m<=n)r*=m;
			System.out.println(r);
//			boolean[]k=new boolean[1000000001];
//			for(;++i<=Math.sqrt(m);k[i]=k[m/i]=m%i==0);
//			for(i=0;i<=m;i++)System.out.print(k[i]+" ");
		}
	}
}