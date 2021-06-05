package _Algorithm.String.KMP;

import java.util.Arrays;
import java.util.Scanner;

//P1786
public class Main {

	static int[]getP(char[]p){
		int m=p.length,j=0;
		int[]pi=new int[m];
		for(int i=1;i<m;i++) {
			while(j>0&p[i]!=p[j])
				j=pi[j-1];
			if(p[i]==p[j])
				pi[i]=++j;
		}
		return pi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]c=s.nextLine().toCharArray(),p=s.nextLine().toCharArray();
		System.out.println(Arrays.toString(getP(p)));
		
		
		
	}

}
