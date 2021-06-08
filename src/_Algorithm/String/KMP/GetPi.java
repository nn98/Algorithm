package _Algorithm.String.KMP;

import java.util.Arrays;
import java.util.Scanner;

public class GetPi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0,pi[]=new int[n];
		char[]a=s.next().toCharArray();
		for(;++i<n;) {
			while(j>0&a[i]!=a[j])j=pi[j];
			if(a[i]==a[j])pi[i]=++j;
		}
		System.out.println(Arrays.toString(pi));
	}

}
