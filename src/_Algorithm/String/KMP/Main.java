package _Algorithm.String.KMP;

import java.util.Arrays;
import java.util.Scanner;

//P1786
public class Main {

	static int[]getP(char[]p){
		int m=p.length,j=0;
		int[]pi=new int[m];
		System.out.println("go: "+Arrays.toString(p));
		for(int i=1;i<m;i++) {
			System.out.println("go: "+Arrays.toString(pi)+" i: "+i+" j: "+j);
			while(j>0&p[i]!=p[j])
				j=pi[j-1];
			if(p[i]==p[j])
				pi[i]=++j;
		}
		return pi;
	}
	static int[]k(char[]s,char[]p){
		int[]a=new int[s.length],pi=getP(p);
		int n=s.length,m=p.length,j=0,x=0;
		for(int i=0;i<n;i++) {
			while(j>0&s[i]!=p[j])
				j=pi[j-1];
			if(s[i]==p[j]) {
				if(j==m-1) {
					a[x++]=i=m+1;
					j=pi[j];
				}else j++;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]c=s.nextLine().toCharArray(),p=s.nextLine().toCharArray();
		System.out.println(Arrays.toString(getP(p)));
		int[]r=k(c,p);
		System.out.println(r.length);
		for(int i:r)System.out.print(i+" ");
		
	}

}
