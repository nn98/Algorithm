package _Algorithm.String.KMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	static List k(char[]s,char[]p){
		int[]pi=getP(p);
		List<Integer>a=new ArrayList();
		int n=s.length,m=p.length,j=0,x=0;
		for(int i=0;i<n;i++) {
			while(j>0&s[i]!=p[j])
				j=pi[j-1];
			if(s[i]==p[j]) {
				if(j==m-1) {
					a.add(i-m+1);
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
		List<Integer> r=k(c,p);
		System.out.println(r.size());
		for(int i:r)System.out.print(i+" ");
		
	}

}
