package BaekJoon;

import java.util.*;
public class P1449 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],i=0,t=0,j;
		for(;i<n;a[i++]=s.nextInt());
		boolean[]l=new boolean[1001],r=new boolean[1001];
		Arrays.sort(a);
		for(i=0;i<n;i++) {
			j=a[i];
			if(l[j]&&r[j])continue;
			t++;
			for(int k=m;k-->0&&j<1001;j++) {
				l[j]=r[j]=true;
			}
		}
		System.out.println(t);
	}
}