package BaekJoon;

import java.util.*;
public class P1806_S {
	public static void main(String[] z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,a[]=new int[n],f=0,t=0,O=Integer.MAX_VALUE,o=O,v=0;
		for(;i<n;i++)a[i]=s.nextInt();
		for(;t<n;){
			v+=a[t];
			if(v>=m){
				while(v>=m)v-=a[f++];
				v+=a[--f];
			}
			if(v>=m)o=o<t-f+1?o:t-f+1;
			t++;
		}
		System.out.print(o==O?0:o);
	}
}