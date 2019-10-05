package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2447_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=n/3;
		String p="***",q="* *";
		String a[]=new String[n];
		for(int i=0;i<n;i++) {
			a[i]="";
			for(int j=0;j<n;j+=3) {
				if(i==1)a[i]+=q;
				else if(i<3)a[i]+=p;
				else {
					
				}
			}
		}
		for(String i:a)System.out.println(i);
	}

}
