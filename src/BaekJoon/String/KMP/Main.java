package BaekJoon.String.KMP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//P1786
public class Main {

	static int[]getP(char[]p){
		int m=p.length,j=0;
		int[]pi=new int[m];
//		System.out.println("go: "+Arrays.toString(p));
		for(int i=1;i<m;i++) {
//			System.out.println("go: "+Arrays.toString(pi)+" i: "+i+" j: "+j);
			while(j>0&p[i]!=p[j])
				j=pi[j-1];
			if(p[i]==p[j])
				pi[i]=++j;
		}
		return pi;
	}
	static List k(char[]S,char[]P){
		int[]pi=getP(P);
		List<Integer>a=new ArrayList();
		int sLen=S.length,pLen=P.length,pIndex=0;
		for(int sIndex=0;sIndex<sLen;sIndex++) {
			while(pIndex>0&S[sIndex]!=P[pIndex])
				pIndex=pi[pIndex-1];
			if(S[sIndex]==P[pIndex]) {
				if(pIndex==pLen-1) {
					a.add(sIndex-pLen+1);
					pIndex=pi[pIndex];
				}else pIndex++;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]c=s.nextLine().toCharArray(),p=s.nextLine().toCharArray();
//		System.out.println(Arrays.toString(getP(p)));
		List<Integer> r=k(c,p);
		System.out.println(r.size());
		for(int i:r)System.out.print(i+1+" ");
		
	}

}
