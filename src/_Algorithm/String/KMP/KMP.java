package _Algorithm.String.KMP;

import java.util.Arrays;
import java.util.Scanner;

public class KMP {

	static String[]H,S;
	static int n,f[],r[];
	
	static void F() {
		int n=S.length,be=1,m=0;
		f=new int[n];
		while(be+m<n) {
			if(S[be+m]==S[m]) {
				m++;
				f[be+m-1]=m;
			}else
				if(m==0)be++;
				else {
					be+=(m-f[m-1]);
					m=f[m-1];
				}
		}
	}
	
	static void K() {
		int h=H.length,s=S.length,be=0,m=0,i=0;
		r=new int[h-s+1];
		while(be<=h-s) {
			if(m<s&H[be+m]==S[m]) {
				m++;
				if(m==s)r[i++]=be;
			}else
				if(m==0)be++;
				else {
					be+=(m-f[m-1]);
					m=f[m-1];
				}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		H=s.next().split("");
		S=s.next().split("");
		F();
		System.out.println(Arrays.toString(f));
		K();
		System.out.println(Arrays.toString(r));
//		String[]a=s.next().split(""),b=s.next().split("");
//		int n=s.nextInt(),h=a.length,g=b.length,f[]=new int[n],
//				r[]=new int[h-g+1],be=1,m=0,i=0,F=0,N=g;
//		while(be+m<N) {
//			if()
//		}
//		while(be<=h-g) {
////			일치 개수 m < 패턴 길이 g
////			a[be+m]과 문자 일치
//			if(m<g&a[be+m]==b[m]) {
//				m++;
//				if(m==g)r[i++]=be;
//			}else
//				if(m==0)be++;
//				else {
//					be+=(m-f[m-1]);
//					m=f[m-1];
//				}
//		}
	}

}
