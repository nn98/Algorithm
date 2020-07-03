package _Algorithm.Greedy;

import java.util.Scanner;

public class P2812 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=0,j=-1,l=n-k;
		char[]a=s.next().toCharArray(),b=new char[l];
		for(;j<l;i++) {
			if(j>=0) {
				if(k>0&j!=0&b[j]<a[i]) {
					k--;
					j--;
				}
			}
			b[++j]=a[i];
		}
	}

}