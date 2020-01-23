package BaekJoon;

import java.util.*;
public class P3460_S{
	public static void main(String[]z){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(),n,i;
		while(T-->0){
			n=sc.nextInt();i=0;
			while(n>0){
				if((n&1)==1)System.out.print(i+" ");
				i++;
				n = n>>1;
			}
		}
	}
}