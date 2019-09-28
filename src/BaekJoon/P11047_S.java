package BaekJoon;

import java.util.Scanner;
public class P11047_S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],c=0;
		for(int i=0;i<n;i++)if(k<=(a[i]=s.nextInt()))n=i;
		while(k>0){
			c+=k/a[--n];
			k%=a[n];
		}
		System.out.print(c);
	}
}
//import java.util.*;class Main{public static void main(String[]z){Scanner s=new Scanner(System.in);int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],c=0;for(int i=0;i<n;i++)if(k<=(a[i]=s.nextInt()))n=i;while(k>0){c+=k/a[--n];k%=a[n];}System.out.print(c);}}