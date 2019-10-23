package BaekJoon;

import java.util.Scanner;
public class P11722 {
	//¿øÆ®
	static int n,a[],h[],r=0,i=0;
	static void o(int x,int u){
		if(!(h[x]>u)){
			h[x]=u;
			for(i=x+1;i<n;i++){
				if(a[i]<a[x])
					if(h[i]<=u)
						o(i,u+1);
			}
			r=r>u?r:u;
		}
	}
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(;i<n;i++)a[i]=s.nextInt();
		for(i=0;i<n;i++)o(i,0);
		System.out.print(r+1);
	}
}